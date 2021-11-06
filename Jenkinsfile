node('LINUX'){
    stage('checkout'){
          git branch: '${BRANCH}', credentialsId: 'BITBUCKET', url: '${REPO_URL}'  
    }
    stage('deploy'){
                sh"echo 'test deploy'"
        
    }
}
