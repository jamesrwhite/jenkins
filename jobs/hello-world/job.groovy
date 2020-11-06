job('examples/hello-world') {
    displayName('Hello World!')

    steps {
        shell('echo "Hello World!"')
    }
}
