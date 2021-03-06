package xyz.isatimur.knowledgebase.design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isatimur on 12.02.2017.
 * Let's create a required slot of parameters to get offers from avia companies.
 * Currently we set only required number of fields so if any of it is null then we should throw a <code>IllegalArgumentException.class</code>
 */
public class AviaOffersRequest {
    private final String pointOfSaleAviaOffers;
    private final String partySeller;
    private final String parameters;
    private final List<String> travelers;
    private final String queryOffers;
    private final List<String> policies;
    private final String version;


    public static class Builder {
        private String pointOfSaleAviaOffers;
        private String partySeller;
        private String parameters;
        private List<String> travelers;
        private String queryOffers;
        private List<String> policies;
        private String version;

        public Builder salesPoint(String pointOfSaleAviaOffers) {
            this.pointOfSaleAviaOffers = pointOfSaleAviaOffers;
            return this;
        }

        public Builder party(String partySeller) {
            this.partySeller = partySeller;
            return this;
        }

        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder travelers(List<String> travelers) {
            this.travelers = new ArrayList<>(travelers);
            return this;
        }

        public Builder query(String queryOffers) {
            this.queryOffers = queryOffers;
            return this;
        }

        public Builder policies(List<String> policies) {
            this.policies = new ArrayList<>(policies);
            return this;
        }

        public Builder vers(String version) {
            this.version = version;
            return this;
        }


        public AviaOffersRequest build() {
            if (pointOfSaleAviaOffers == null || partySeller == null || parameters == null || travelers == null || queryOffers == null || policies == null || version == null)
                throw new IllegalArgumentException();
            return new AviaOffersRequest(this.pointOfSaleAviaOffers, this.partySeller, this.parameters, this.travelers, this.queryOffers, this.policies, this.version);
        }
    }

    private AviaOffersRequest(String pointOfSaleAviaOffers, String partySeller, String parameters, List<String> travelers, String queryOffers, List<String> policies, String version) {
        this.pointOfSaleAviaOffers = pointOfSaleAviaOffers;
        this.partySeller = partySeller;
        this.parameters = parameters;
        this.travelers = travelers;
        this.queryOffers = queryOffers;
        this.policies = policies;
        this.version = version;
    }

    /**
     * toString()
     *
     * @return String description of fields
     */
    @Override
    public String toString() {
        return "AviaOffers{" +
                "pointOfSaleAviaOffers='" + pointOfSaleAviaOffers + '\'' +
                ", partySeller='" + partySeller + '\'' +
                ", parameters='" + parameters + '\'' +
                ", travelers=" + travelers +
                ", queryOffers='" + queryOffers + '\'' +
                ", policies=" + policies +
                ", version='" + version + '\'' +
                '}';
    }
}
