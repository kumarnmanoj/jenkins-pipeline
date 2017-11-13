#!/usr/bin/env groovy

pipeline {

    agent any

    triggers {
        pollSCM('H/15 * * * *')
    }

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
