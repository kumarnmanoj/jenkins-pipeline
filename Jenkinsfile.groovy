#!/usr/bin/env groovy

pipeline {
    stages {
        stage("Sample"){
            steps {
                sh '''
                    echo "In stage2 2 branch"
                '''
            }
        }
    }
}
