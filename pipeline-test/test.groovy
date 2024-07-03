pipeline {
    agent any
    triggers {
        pollSCM('*****')
    }

    stages {
        stage('Checkout'){
            steps {
                git branch: 'main',
                url: '<http>'

            }
        }
        stage('Build'){
            steps {
                sh "echo 'hey'"


            }
        }
        stage('Test'){
            steps {
                sh "echo 'TBH'"

            }
        }
        stage('Deploy'){
            steps {
                deploy adapters: [tomcat9(credentialsId: '<NAME>', url: '<URL>')],
                contextPath: null, war: 'path/to/war'
            }
        }    
    }


}