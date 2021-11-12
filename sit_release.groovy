pipeline{
    agent any
    stages{
        stage('scmcheckout'){
            steps{
                script{
                    git branch: 'main', credentialsId: 'BITBUCKET', url: 'https://github.com/ravivarma4ever/testdemo.git'
                }
            }
        }
        stage('scan'){
            steps{
                script{
                    sh"echo 'test' > test1.txt"
                    withSonarQubeEnv(credentialsId: 'SONAR') {
                        sh"/sonar-scanner/bin/sonar-scanner -Dsonar.projectKey=demo -Dsonar.sources=. -Dsonar.java.binaries=."
                        echo "scan is success"
                    }
                }
            }
        }
        stage('upload'){
            steps{
                script{
                    echo "upload to artifactory"
                    rtServer (
    id: 'Artifactory-1',
    url: 'https://ravivarma.jfrog.io/artifactory',
    // If you're using username and password:
    //username: 'user',
    //password: 'password',
    credentialsId: 'JFROG',
    bypassProxy: false,
    timeout: 300
)
                    rtUpload (
    serverId: 'Artifactory-1',
    spec: '''{
          "files": [
            {
              "pattern": "test1.txt",
              "target": "demo-libs-release-local/com/demo/${BUILd_NUMBER}"
            }
         ]
    }'''
    //buildName: 'demo',
    //buildNumber: '1',
    //project: 'demo-libs-release-local'
)
                }
            }
        }
    }
    post{
        always{
            cleanWs()
        }
    }
}
