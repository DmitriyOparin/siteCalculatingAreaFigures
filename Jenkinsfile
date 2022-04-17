pipeline {
    agent any
    
    environment {
        JIRA_USER = 'admin'
    }
    
    parameters {
        string(name: 'BRANCH', defaultValue: 'master', description: 'Branch for tests')
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
