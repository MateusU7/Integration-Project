
// Mateus Urbanski
// This is an Object class

import java.util.Random;

public class Ship {

    public static int getCapital() {
        Random random = new Random();
        int capital = 200 + random.nextInt(801);
        return capital;
    }

    /*
     * The line below is the header for the method getShip The getShip method
     * has the parameters 'men' and 'capital'
     */
    public static String getShip(int men, int capital) {
        String ship;
        int menCut = 0;
        String summary;

        if (men >= 11 && (capital - 600) >= 220) {
            ship = "Galleon";
            if ((men * 20) > (capital - 600)) {
                menCut = men - ((capital - 600) / 20);
            }
        } else if (men >= 5 && (capital - 400) >= 100) {
            ship = "Brig";
            if ((men * 20) > (capital - 400)) {
                menCut = men - ((capital - 400) / 20);
            }
        } else {
            ship = "Sloop";
            if ((men * 20) > (capital - 200)) {
                menCut = men - ((capital - 200) / 20);
            }
        }
        summary = "We were able to obtain a " + ship + ". " + menCut
                + " men had to be cut due to budget.";

        return summary;
    }

    public static int getMenCut(int men, int capital) {
        int menCut = 0;

        if (men >= 11 && (capital - 600) >= 220) {
            if ((men * 20) > (capital - 600)) {
                menCut = men - ((capital - 600) / 20);
            }
        } else if (men >= 5 && (capital - 400) >= 100) {
            if ((men * 20) > (capital - 400)) {
                menCut = men - ((capital - 400) / 20);
            }
        } else {
            if ((men * 20) > (capital - 200)) {
                menCut = men - ((capital - 200) / 20);
            }
        }

        return menCut;
    }
}
