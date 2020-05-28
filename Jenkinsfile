pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Running from Jenkins file'
        bat(script: 'mvn verify', label: 'maven')
      }
    }
  }
}