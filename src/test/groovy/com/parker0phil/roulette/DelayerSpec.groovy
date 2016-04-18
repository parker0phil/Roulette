package com.parker0phil.roulette

import spock.lang.Specification

import java.time.Clock

class DelayerSpec extends Specification {

    def "delayer calls back after period"() {

        given:
        def clock = Mock(Clock)
        clock.millis() >>> [10000, 10000, 29000, 30000]
        def delayer = new Delayer(clock, 20)

        when:

        def finishedImmediately = delayer.finished()
        def finhishedBeforeBoundary = delayer.finished()
        def finishedAfterBoundary = delayer.finished()

        then:
        finishedImmediately == false
        finhishedBeforeBoundary == false
        finishedAfterBoundary == true
    }
}
