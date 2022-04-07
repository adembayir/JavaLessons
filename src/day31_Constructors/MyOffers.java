package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("San Jose, CA", "Sanmina Corp.", "Test Automation Engineer", 90000.0, true, false, false, false );

        Offer offer2 = new Offer();
        offer2.setInfo("Mc Lean, VA", "Cydeo", "QA", 100000.0, true, true, false, true );

        Offer offer3 = new Offer();
        offer3.setInfo("Mountain View, CA", "Google", "SDET", 135000.0, true, false, true, true );

        Offer offer4 = new Offer();
        offer4.setInfo("Santa Clara, CA", "Intel", "SDET", 112000.0, false, true, false, true );

        Offer offer5 = new Offer();
        offer5.setInfo("Austin, TX", "Dell", "QA", 70000.0, true, true, false, false );

        Offer offer6 = new Offer();
        offer6.setInfo("Seoul, South Korea", "LG Electronics", "Test Automation Engineer", 130000.0, false, true, true, true );

        Offer offer7 = new Offer();
        offer7.setInfo("Osaka, Japan", "Panasonic", "QA", 1230000.0, true, true, true, true );


        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p -> !(p.location.substring(p.location.length()-2).equals("CA")));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();





    }
}
