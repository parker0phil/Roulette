package com.parker0phil.roulette

import org.junit.Rule
import org.junit.contrib.java.lang.system.TextFromStandardInputStream
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import org.junit.contrib.java.lang.system.SystemOutRule;
import spock.lang.Specification

class ConsoleApplicationSpec extends Specification {

    @Rule
    public final TextFromStandardInputStream systemInput = emptyStandardInputStream();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().mute().enableLog();

    def "outputs correctly"(){
        when:
        new ConsoleApplication().main()
        def output =  systemOutRule.getLog();

        then:
        int response = Integer.parseInt((output =~ "(.*)\n")[0][1])
        response <= 36
        response >= 0

    }
}
