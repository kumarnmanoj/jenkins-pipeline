#!/usr/bin/env groovy

pipeline {
    stages {
        stage("Sample"){
            steps {
                sh '''
                    echo "In stage1 branch"
                '''
            }
        }
    }
}
