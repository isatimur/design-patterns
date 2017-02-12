package xyz.isatimur.knowledgebase.design.patterns.builder;

import java.util.Arrays;

/**
 * Created by isati on 12.02.2017.
 */
public class QueryAviaTrip {
    public static void main(String[] args) {
        AviaOffersRequest offers = new AviaOffersRequest.Builder()
                .salesPoint("at Vnukovo airport")
                .party("UTAIR")
                .travelers(Arrays.asList("Trump", "Obama", "Elizaveta"))
                .query("2 tickets to India one way trip")
                .parameters("business class")
                .policies(Arrays.asList("1 bag", "1 lunch"))
                .vers("1.0")
                .build();

        System.out.println(offers);
    }
}
