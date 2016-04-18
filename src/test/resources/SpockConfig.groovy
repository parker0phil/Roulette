import acceptance.ConsoleApplicationSpec

runner {

    if (!System.properties.containsKey('test.include.slow')) {
        exclude ConsoleApplicationSpec
    }
}