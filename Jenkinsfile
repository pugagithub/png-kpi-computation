pipeline {
    agent { docker {
    image 'maven:3.3.3'
    customWorkspace '/Users/spugazhendhi/myjenkins_workspace'
  } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
