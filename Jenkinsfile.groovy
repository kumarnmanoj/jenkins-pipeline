#!/usr/bin/env groovy

pipeline {
    triggers {
        pollSCM('H/15 * * * *')
    }

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
