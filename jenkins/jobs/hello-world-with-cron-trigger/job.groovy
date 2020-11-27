job('examples/hello-world-with-cron-trigger') {
    displayName('Hello World with Cron Trigger')

    triggers {
        cron('H/15 * * * *')
    }

    steps {
        shell('echo "Hello World!"')
    }
}
