pipeline {
    agent any
    
    environment {
        JIRA_USER = 'admin'
    }
    
    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo 'Branch is ${params.BRANCH}'
                echo "Branch is ${params.BRANCH}"
                echo "Jira user is ${env.JIRA_USER}"
            }
        }
    }
}
