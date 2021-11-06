node('LINUX'){
    stage('checkout'){
          git branch: '${BRANCH}', credentialsId: 'BITBUCKET', url: '${REPO_URL}'  
    }
    stage('deploy'){
             println "Deployment is success"
        sh '''terraform init
        terraform plan 
        terraform apply --auto-approve=yes'''
    }
}
