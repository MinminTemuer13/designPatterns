package org.example;

import lombok.ToString;

@ToString
public class MDBC {
    private static MDBC instance;
    private Integer num;
    private MDBC() {
        num = 0;
    }

    public static MDBC getInstance() {
        if (MDBC.instance == null) {
            MDBC.instance = new MDBC();
        }
        return MDBC.instance;
    }

    public void countPlus() {
        num += 1;
    }
}
