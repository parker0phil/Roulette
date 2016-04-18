package acceptance

import com.parker0phil.roulette.ConsoleApplication
import org.junit.Rule
import org.junit.contrib.java.lang.system.SystemOutRule
import spock.lang.Specification

import java.time.Clock

class ConsoleApplicationSpec extends Specification {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().mute().enableLog();

    def "outputs correctly with delay"() {
        given:
        def clock = Clock.systemDefaultZone()

        when:
        long start = clock.millis()
        new ConsoleApplication().main()
        long end = clock.millis()
        def output = systemOutRule.getLog();

        then:
        end - start >= 20000
        end - start <= 20100
        int response = Integer.parseInt((output =~ "(.*)\n")[0][1])
        response <= 36
        response >= 0
    }
}
