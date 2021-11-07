def call(){
  pipeline{
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
