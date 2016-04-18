package com.parker0phil.roulette

import spock.lang.Specification

import java.time.Clock

class DelayerSpec extends Specification {

    def "delayer calls back after period"() {
        def START_TIME = 10000
        def END_TIME = START_TIME + 20000

        given:
        def clock = Mock(Clock)
        clock.millis() >>> [START_TIME, START_TIME + 1, END_TIME - 1, END_TIME]
        def delayer = new Delayer(clock, 20)

        when:

        def finishedImmediately = delayer.finished()
        def finishedBeforeBoundary = delayer.finished()
        def finishedAtBoundary = delayer.finished()

        then:
        finishedImmediately == false
        finishedBeforeBoundary == false
        finishedAtBoundary == true
    }
}
