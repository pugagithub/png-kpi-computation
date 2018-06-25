pipeline {
    agent any
    stages {
        stage('No-op') {
            steps {
                sh 'ls'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        success {
             mail to: 'pugal.sym@gmail.com',
                  subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                  body: "Build Successful : Build Numbe : ${env.BUILD_URL}"
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
           mail to: 'pugal.sym@gmail.com',
                subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                body: "Something is wrong with ${env.BUILD_URL}"
        }
        changed {
            echo 'Things were different before...'
        }
    }
}