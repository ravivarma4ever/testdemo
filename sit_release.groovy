
  pipeline{
    agent { label 'master'}
    stages{
      stage('Build'){
        steps{
          script{
            echo "Build success"   
            Ansible_deploy()
          }
        }  
      }
    }
  }
def Ansible_deploy(){
 println"Ansible Deploy" 
}
