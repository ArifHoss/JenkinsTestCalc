pipeline{
    agent any
    tools{
        maven 'Maven 3.6.3'
    }
    stages{
        stage('Build'){
            steps{
                echo 'Calculator'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}