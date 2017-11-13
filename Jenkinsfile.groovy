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
<<<<<<< HEAD
                        echo "In stage2 2 branch"
=======
                        echo "In stage1 branch"
                        echo "My change for stage1"
>>>>>>> 3c5709dd5ae3e31d117a93469bda788e64bce69e
                    '''
                }
            }
        }
}
