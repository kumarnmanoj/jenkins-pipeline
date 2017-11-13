#!/usr/bin/env groovy

pipeline {
    triggers {
        pollSCM('H/15 * * * *')
    }

    node {
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
}
