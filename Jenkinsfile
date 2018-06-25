pipeline {
    agent any
    stages {
        stage('No-op') {
            steps {
                script {
                    sh 'echo "New Hello Worls" '
                }
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'

        }
        success {
           echo 'I am success :/'

        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
           echo 'I am failure :/'

        }
        changed {
            echo 'Things were different before...'
        }
    }
}