pipeline {
    agent any

    agent {
        node { label 'workstation' }

    }

    agent {
        label  'terraform'
    }

    stages {

        stage ('one') {
            steps {
                echo 'Hello deol'

            }
        }

       stage ('two') {
        steps {
            echo 'Hello jemi'
        }
    }
    }
    }