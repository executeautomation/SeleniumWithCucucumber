pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh './gradlew build --no-daemon'
                archiveArtifacts artifacts: 'dist/trainSchedule.zip'
            }
        stage('validate'){
            sh 'mvn validate'
        }
        stage('compile'){
            sh 'mvn clean compile'
       }
        }
