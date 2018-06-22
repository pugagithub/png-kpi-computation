pipeline {
    agent { docker {
   image 'maven:3.3.3'
  } }
    stages {
        stage('build') {
            steps {
               sh 'echo "Hello World"'
                               sh '''
                                   echo "Multiline shell steps works too"
                                   ls -lah
                               '''

            }
        }
    }
}
