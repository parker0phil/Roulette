package com.parker0phil.roulette

import spock.lang.Specification

import java.security.SecureRandom

class NumberChooserSpec extends Specification {

    def "chooses number from random data source"() {

        given:
        def random = Mock(Random)
        def chooser = new NumberChooser(random)
        def anyNumber = 5;

        when:
        def chosen = chooser.choose()

        then:
        1 * random.nextInt(37) >> anyNumber
        chosen == anyNumber
    }

    def "number chooser selects all options (for the paranoid - but spotted mistake in the upper bound exclusivity)"() {

        given:
        def chooser = new NumberChooser(SecureRandom.instanceStrong)
        def allNumbers = ( ArrayList ) (0..36)
        when:
        while ( allNumbers.size() > 0 ) {
            Integer next = chooser.choose()
            allNumbers.remove(( Object ) next)
        }

        then:
        true
    }
}
