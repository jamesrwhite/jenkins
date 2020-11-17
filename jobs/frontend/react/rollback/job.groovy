pipelineJob('frontend/react/rollback') {
    displayName('Rollback')

    definition {
        cpsScm {
            scm {
                git {
                    branch('master')
                    remote {
                        github('jamesrwhite/jenkins')
                    }
                }
            }

            scriptPath('jobs/frontend/react/rollback/Jenkinsfile')
        }
    }
}
