def call(){
  pipeline{
    agent { label 'master' }
    stages{
      stage('Build'){
        steps{
          script{
            echo "Build success"   
          }
        }  
      }
    }
  }
}
