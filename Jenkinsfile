pipeline {
    agent { docker {
    image 'maven:3.3.3'
    args '-u root:root -v /Users/spugazhendhi/Desktop/Pugal/JenkinsHomeDir/.jenkins/workspace/:/Users/spugazhendhi/Desktop/Pugal/JenkinsHomeDir/.jenkins/workspace/'
     } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
