pipeline {
    agent any
    
    stages {
        stage('Checkout GIT') {
            steps {
                echo 'Récupération du code depuis Git...'
                git branch: 'main',
                    url: 'https://github.com/esprite922-lgtm/mon-projet-jenkins.git'
            }
        }
        
        stage('Compile') {
            steps {
                echo 'Compilation du projet...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Lancement des tests unitaires...'
                sh 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                echo 'Création du JAR...'
                sh 'mvn package -DskipTests'
            }
        }
    }
    
    post {
        success {
            echo 'BUILD RÉUSSI !'
        }
        failure {
            echo 'BUILD ÉCHOUÉ !'
        }
    }
}
