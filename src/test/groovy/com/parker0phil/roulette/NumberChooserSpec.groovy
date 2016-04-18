package com.parker0phil.roulette

import spock.lang.Specification

class NumberChooserSpec extends Specification {

    def "chooses number from random data source"() {

        given:
        def random = Mock(Random)
        def chooser = new NumberChooser(random)
        def anyNumber = 5;

        when:
        def chosen = chooser.choose()

        then:
        1 * random.nextInt(36) >> anyNumber
        chosen == anyNumber
    }
}
