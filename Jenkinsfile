node('LINUX'){
    stage('checkout'){
          //git branch: '${BRANCH}', credentialsId: 'BITBUCKET', url: '${REPO_URL}'  
        sh"ls -ltr"
    }
    stage('deploy'){
             println "Deployment is success"
        sh '''terraform init
        terraform plan 
        terraform apply'''
    }
}
