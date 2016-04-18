package com.parker0phil.roulette

import spock.lang.Specification

class RouletteWheelSpec extends Specification {

    def "roulette wheel uses number chooser and delayer"() {
        given:
        def delayer = Mock(Delayer)
        def chooser = Mock(NumberChooser)


        when:
        new RouletteWheel(chooser, delayer).spin()

        then:
        1 * delayer.finished() >> false
        1 * delayer.finished() >> true
        1 * chooser.choose()
    }
}
