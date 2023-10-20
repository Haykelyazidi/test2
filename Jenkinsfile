pipeline {
    agent any
     tools {
        maven "mvn"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

    
        stage('Test') {
            steps {
                sh 'mvn test' //-DsuiteXmlFile=testng.xml '  // Run TestNG tests
            }
        }
    }
}