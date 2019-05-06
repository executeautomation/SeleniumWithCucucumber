pipeline {
    agent any
    stages {
        stage('validate'){
            steps { 
                echo 'mvn validate'
                sh 'mvn validate'
            }}
        stage('compile'){
            steps {
            echo 'mvn compile'
            sh 'mvn clean compile'
            }}
        }
}
