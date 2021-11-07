
  pipeline{
    agent { label 'master'}
    stages{
      stage('Build'){
        steps{
          script{
            echo "Build success"   
            Ansible_deploy()
            nexusArtifactUploader artifacts: [[artifactId: 'demo', classifier: '', file: 'demo.zip', type: 'zip']], credentialsId: 'LOCALID', groupId: 'com.demo', nexusUrl: 'nexus.ravi.com/repository', nexusVersion: 'nexus3', protocol: 'https', repository: 'demo', version: '1'
          }
        }  
      }
    }
  }
def Ansible_deploy(){
 println"Ansible Deploy" 
}
