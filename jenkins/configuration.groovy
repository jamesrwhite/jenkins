job('configuration') {
    displayName('Configuration')
    description('Automatic git based job and folder configuration, runs every 15 mins')
    logRotator(7)

    triggers {
        cron('H/15 * * * *')
    }

    scm {
        git {
            remote {
                github('jamesrwhite/jenkins')
            }
        }
    }

    steps {
        dsl {
            external([
                'folders/**/*.groovy',
                'jobs/**/*.groovy',
            ])

            ignoreExisting(false)
            lookupStrategy('SEED_JOB')
            removeAction('DELETE')
            removeViewAction('DELETE')
        }
    }
}
