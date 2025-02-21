package org.examplejava.InterfaceClassConstruction;

public class MainRemote {

    public static void main(String[] args) {

        TV tv = new TV();
        tv.on();
        tv.changeChanel(35);

        TV.battery tvb = tv.new battery(1200);
        tvb.battery();


        DVD dvd = new DVD();
        dvd.on();
        dvd.changeChanel(12);

        DVD.CDDVD cddvd = new DVD.CDDVD();
        cddvd.insertCD("Fast and Furious");

    }

}
