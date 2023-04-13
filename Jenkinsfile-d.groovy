pipeline {
    agent any

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