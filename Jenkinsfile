
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}