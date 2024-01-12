package org.example;

import org.example.publishers.CCF;
import org.example.publishers.NBA;
import org.example.publishers.TheEconomist;
import org.example.subscribers.Investor;
import org.example.subscribers.SportFan;
import org.example.subscribers.TechEnthusiast;
import org.example.subscribers.TechInvestor;

public class Main {
    public static void main(String[] args) {
        CCF ccf = new CCF();
        NBA nba = new NBA();
        TheEconomist theEconomist = new TheEconomist();

        TechEnthusiast techEnthusiast = new TechEnthusiast();
        SportFan sportFan = new SportFan();
        Investor investor = new Investor();
        TechInvestor techInvestor = new TechInvestor();

        ccf.subscribe(techEnthusiast);
        ccf.subscribe(techInvestor);

        nba.subscribe(sportFan);

        theEconomist.subscribe(investor);
        theEconomist.subscribe(techInvestor);

        ccf.notifySubscribers();
        nba.notifySubscribers();
        theEconomist.notifySubscribers();
    }
}