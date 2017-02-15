package xyz.isatimur.knowledgebase.design.patterns.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by isati on 13.02.2017.
 */
public class IntegerCacheTest {

    @Test
    public void testFlyWeight() {
        final Integer a = ProvokingIntegerInitialization.valueOf(46);
        final Integer b = ProvokingIntegerInitialization.valueOf(46);
        assertSame(a, b);

        final Integer c = ProvokingIntegerInitialization.valueOf(1778);
        final Integer d = ProvokingIntegerInitialization.valueOf(1778);
        assertNotSame(c, d);

    }
}