
/**
 * This class contains a method to get a randomly generated amount of capital,
 * a method that returns the best possible ship given how big of a crew the user
 * would like and the randomly generated capital, and a method that returns how
 * many men must be cut to attain that ship.
 * 
 * @author Mateus Urbanski
 */

import java.util.Random;

public class Ship {

  /**
   * Randomly generates money ranging from 200 to 800 doubloons.
   * 
   * @return the user's capital.
   */
  public static int getCapital() {
    Random random = new Random();
    int capital = 200 + random.nextInt(801);
    return capital;
  }

  /**
   * Assigns the user a ship based on their amount of money and the requested
   * amount of men.
   * 
   * @param men     The user's requested amount of men.
   * @param capital The user's randomly generated capital.
   * @return the user's ship.
   *
   *         The line below is the header for the method getShip The getShip
   *         method has the parameters 'men' and 'capital'
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

  /**
   * Tells the user the amount of men of the user's initially requested number
   * that will not be a part of the crew due to budget.
   * 
   * @param men     The user's requested amount of men.
   * @param capital The user's randomly generated capital.
   * @return the amount of men cut from the original number
   */
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
