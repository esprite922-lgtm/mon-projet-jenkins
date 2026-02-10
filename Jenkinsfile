pipeline {
    agent any
    
    stages {
        stage('Checkout GIT') {
            steps {
                echo '=== ÉTAPE 1 : RÉCUPÉRATION DU CODE ==='
                echo 'Téléchargement du code depuis GitHub...'
                git branch: 'main',
                    url: 'https://github.com/esprite922-lgtm/mon-projet-jenkins.git'
                echo '✓ Code récupéré avec succès !'
            }
        }
        
        stage('Compile') {
            steps {
                echo '=== ÉTAPE 2 : COMPILATION ==='
                echo 'Compilation du code Java en cours...'
                sh 'mvn clean compile'
                echo '✓ COMPILATION RÉUSSIE !'
                echo '✓ Le code Java a été compilé avec succès !'
                echo '✓ Les fichiers .class ont été générés dans /target/classes'
            }
        }
        
        stage('Test') {
            steps {
                echo '=== ÉTAPE 3 : TESTS UNITAIRES ==='
                echo 'Lancement des tests unitaires...'
                sh 'mvn test'
                echo '✓ TOUS LES TESTS SONT PASSÉS !'
                echo '✓ La classe Calculatrice fonctionne correctement !'
            }
        }
        
        stage('Package') {
            steps {
                echo '=== ÉTAPE 4 : CRÉATION DU PACKAGE ==='
                echo 'Création du fichier JAR...'
                sh 'mvn package -DskipTests'
                echo '✓ PACKAGE CRÉÉ AVEC SUCCÈS !'
                echo '✓ Fichier JAR généré : mon-projet-jenkins-1.0-SNAPSHOT.jar'
            }
        }
    }
    
    post {
        success {
            echo '=================================='
            echo '✓✓✓ PIPELINE TERMINÉ AVEC SUCCÈS !'
            echo '=================================='
            echo 'Le projet a été compilé, testé et packagé.'
        }
        failure {
            echo '=================================='
            echo '✗✗✗ ÉCHEC DU PIPELINE !'
            echo '=================================='
        }
    }
}
