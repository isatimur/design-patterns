package xyz.isatimur.knowledgebase.design.patterns.builder;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by isati on 12.02.2017.
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        AviaOffersRequest offers = new AviaOffersRequest.Builder()
                .salesPoint("at Vnukovo airport")
                .party("UTAIR")
                .travelers(Arrays.asList("Trump", "Obama", "Elizaveta"))
                .query("2 tickets to India one way trip")
                .parameters("business class")
                .policies(Arrays.asList("1 bag", "1 lunch"))
                .vers("1.0")
                .build();

        assertTrue(offers.toString().contains("UTAIR"));

        offers = new AviaOffersRequest.Builder()
                .salesPoint("at Sheremetievo airport")
                .party("S7")
                .travelers(Arrays.asList("Taylor"))
                .query("1 ticket to Poland one way trip")
                .parameters("standard class")
                .policies(Arrays.asList("1 lunch"))
                .vers("1.5")
                .build();
        assertTrue(offers.toString().contains("standard class"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArguments() {
        AviaOffersRequest.Builder builder = new AviaOffersRequest.Builder();
        AviaOffersRequest reqest = builder.salesPoint("").query("").build();

    }
}