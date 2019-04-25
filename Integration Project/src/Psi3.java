
/** 
 * The following program will demonstrate the integration of basic Java concepts
 * in the manner of an adventure out of 'The Pirates of the Caribbean.'
 * 
 * This is the driver class that contains all of the main dialogue
 * and calls methods, from the Ship, Person, and Sailor classes.
 * 
 * @author Mateus Urbanski
 * 
 * 
 * Java Built-in Data Types:
 * Byte - Store minimum/maximum value of -128/127.
 * Short - Store minimum/maximum value of -32,768/32,767.
 * Int - Store minimum/maximum value of -2^(31)/2^(31)-1.
 * Long - Store minimum/maximum value of -2^(63)/2^(63)-1.
 * Float - Store decimals (32-bit). Never use for precision.
 * Double - Store decimals (64-bit). Never use for precision
 * Boolean - One bit of information that is true or false.
 * Char - Single 16-bit of Unicode that stores a character.
 * String - Reference data type used to make strings into objects.
 * 
 * Terms:
 * Variable - Location of memory that information is assigned then referred to.
 * Scope - A variable only accessible in the method it was declared in.
 * Operator Precedence - If multiple operators are found on a line, 
 *      operators with higher precedence are evaluated first. 
 *      If operators of equal precedence appear in same expressions... 
 *      Binary operators are evaluated left to right
 *      Assignment operators are evaluated right to left
 * == - When using '==' to compare two objects, it will compare their locations
 *      in memory and return a boolean value.
 * Inheritance - Process where one class acquires properties 
 *      (fields and methods) of another. A subclass inherits from a superclass.
 *      It benefits programming as it eliminates redundant code.
 */

import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Psi3 {

  /**
   * The main method of the driver class or essentially "...the program." Below
   * is a header public is an access modifier void is the return type, meaning
   * this method doesn't return anything method names should be in
   * lowerCamelCase and be named with a verb
   */
  public static void main(String[] args) {
    String jackDialogue = "Jack: ";
    // Check-style sees this as an error but it is aligned with Google Style.
    final String NAME = "Captain Jack Sparrow";
    // final - A constant variable that cannot be changed by a method.
    final String ENDING = "\nTo be continued...";
    boolean lie = true;
    int numOfSeas = 7;
    double gold = 210.5;
    Scanner input = new Scanner(System.in);

    System.out.println(jackDialogue + "Ahoy there user! Try and keep up.\n");
    System.out.println("Guard: Who are you and what's a user?!");
    System.out.println(jackDialogue + "It's Ol\' " + NAME + " back "
        + "from sailing the " + numOfSeas + " Seas ye scalleywag!");
    System.out.println("Guard: So yer a pirate?");
    System.out.println(jackDialogue + "Heavens no, I'm a er... merchant!"
        + " Yep made " + gold + " doubloons this past voyage.");
    System.out.println("Guard: You sure Jack? There isn't such a thing as "
        + "\'0.5\' of a doubloon.");
    System.out.println(jackDialogue + "It's " + lie + ", I swear it! I "
        + "meant to say " + (int) gold);
    // Casting - This double is able to fit into int so it is converted.
    System.out.println("Guard: My days! You could hire 10 men fer 20 doubloons "
        + "a brain and still have " + (int) gold % 20 + " to share!\n");

    int capital = Ship.getCapital();

    System.out.println(NAME + " walks into the pub.");
    System.out.println(
        jackDialogue + "I need to find men for me ship! Oy user, wake up! "
            + "How many men should I recruit?");
    System.out.println("We've got " + capital + " doubloons. "
        + "Each man costs 20 doubloons to hire.");
    System.out.println("Keep in mind a Sloop holds 1-4, a Brig carries 5-10,"
        + " and a Galleons fits 11-20.");
    System.out.println("A Sloop costs 200, a Brig costs 400, and "
        + "a Galleon costs 600 doubloons.\n");

    int men;
    String summary;
    int counter = 0;

    /*
     * Allows user to choose how many men they'd like between 1-20. If a
     * negative number is entered, it is assumed a mistake is made, the absolute
     * value of the negative number is taken, and that resulting integer is
     * evaluated. If a decimal is entered, the nearest whole number is used.
     * Catches the exception of typing in a non-number and handles any other
     * issues.
     */
    do {
      System.out.println((counter < 0)
          ? "\nThat number of men cannot fit on a ship. Try again."
          : "Enter a number between 0 & 20:");
      try {
        men = Math.abs(Integer.parseInt(input.nextLine()));
        counter--;
      } catch (NumberFormatException ex) {
        men = 21;
        System.out.println("We need a number matey! Try again...");
      } catch (Exception ex) {
        men = 21;
        System.out.println("Er something went wrong. Try again...");
      }
    } while (men > 20);
    summary = Ship.getShip(men, capital);
    // Ship.getShip() is a method call with the arguments 'men' & 'capital'
    System.out.println("\n" + summary + "\n");
    men = men - Ship.getMenCut(men, capital);
    /*
     * If the user types in 0, there is separate appropriate dialogue.
     * Otherwise, Jack counts to the amount of men.
     */
    switch (men) {
      case 0:
        System.out.println(jackDialogue + "Well looks like Jackie boy "
            + "is all alone yet again.");
        break;
      /*
       * The break statement prevents the statement from 'falling through' by
       * exiting the switch statement and proceeding to the next print statement
       */
      default:
        System.out.println(jackDialogue + "Let's make sure I haven't "
            + "left a lad! Let me count it up...");
        for (counter = 1; counter <= men; counter++) {
          System.out.println(counter);
          if (counter != men) {
            continue;
            /*
             * This continue is used to skip the following print statement for
             * every iteration that is not the last
             */
          }
          System.out.println("Looks like we've got everyone!");
        }
    }

    String response;

    System.out.println("\nJack's Parrot: *SQUAWK* My name's Jack and I "
        + "need friends to affirm my purpose in life *SQUAWK*");
    System.out.println(jackDialogue + "Oy! At'll be the last coming from "
        + "you! An that's not my name! "
        + "\nGo on user, tell em what it is...");
    counter = 1;
    /*
     * Loops until the user enters "Captain Jack Sparrow." If more than one
     * attempt is needed, then Jack will tell the users how many tries it took.
     */
    while (NAME.compareTo("Captain Jack Sparrow") == 0) {
      response = input.nextLine();
      if (response.equalsIgnoreCase("Captain Jack Sparrow")) {
        System.out.println(jackDialogue + "And you best remember it!");
        System.out.println(
            (counter > 1) ? "It only took ya " + counter + " tries!" : "");
        break;
        /*
         * The break statement ensures that once the correct name is given, the
         * infinite while loop ends
         */
      } else if (response.equalsIgnoreCase("Jack Sparrow")) {
        System.out.print(jackDialogue + "Don't forget I'm your Captain!");
      } else {
        System.out.print(jackDialogue + "Nope that's not it.");
      }
      System.out.println(" Try again!");
      counter += 1;
    }
    input.close();

    int menJumpOff;
    int newMen;
    String direction = "";
    int index = 0;

    ArrayList<String[]> location = new ArrayList<String[]>();
    location
        .add(new String[] { "Port Royal", "St. Mary's Island", "Clew Bay" });
    location
        .add(new String[] { "New Providence", "Barataria Bay", "Palm Cove" });
    System.out.println(
        "\nIt was now time for Jack to decide on his desired location.");
    System.out.println(
        "3 plundering hotspots laid in the North and 3 in " + "the South.");
    Random random = new Random();
    String destination = location.get(random.nextInt(1))[random.nextInt(2)];
    /*
     * Searches the 2-D array of locations and logs the cardinal direction and
     * index.
     */
    for (int r = 0; r < 2; r++) {
      for (int c = 0; c < 3; c++) {
        if ((location.get(r)[c]).equals(destination)) {
          direction = (r == 0) ? "North" : "South";
          index = c + 1;
        }
      }
    }
    System.out.println(
        "After several flips of a coin, Jack set " + "sail for " + destination
            + ", location number " + index + " to the " + direction + ".");
    // Following 2 if-statements ensure the amount of men is fixed to 4.
    if (men > 4) {
      menJumpOff = men - 4;
      System.out.println("They passed the Siren Isles and " + menJumpOff
          + " heard their song and took a plunge. 4 men remained.");
    } else if (men < 4) {
      newMen = 4 - men;
      System.out.println("After stopping in Tortuga Bay for a pit stop, "
          + newMen + " men volunteered to crew. The ship was now "
          + "manned with 4.");
    }

    int accumulator = 0;
    int lightest;

    Sailor jack = new Sailor("Captain", "Jack Sparrow", 190);
    Sailor william = new Sailor("First Mate", "William Turner", 200);
    Person chef = new Person("Chef Antoine", 220);
    Sailor ben = new Sailor("Navigator", "Bootstrap Bill", 180);
    Person[] crew = new Person[] { jack, william, chef, ben };
    ArrayList<Integer> weights = new ArrayList<Integer>();
    /*
     * Transfers the weights from the crew-members from the array 'crew' of type
     * Person to the Arraylist 'weights.' Array 'crew' exhibits polymorphism
     * because it contains elements of type Person, the parent class, and type
     * Sailor, the subclass.
     */
    for (Person j : crew) {
      weights.add(j.getWeight());
    }
    // Gets the total weight of the crew.
    for (int i : weights) {
      accumulator += i;
    }
    lightest = weights.get(0);
    int lightestIndex = 0;
    /*
     * Searches for the smallest number within the Arraylist 'weights' and
     * determines its index.
     */
    for (int j = 0; j < weights.size(); j++) {
      if (weights.get(j) < lightest) {
        lightest = weights.get(j);
        lightestIndex = j;
      }
    }
    System.out.println(jackDialogue + "Well men, with all this fog we'll be"
        + " needing one of us to climb up the ol' rickety crow's nest.");
    System.out.println("I propose it be the lightest of our " + accumulator
        + " overall pounds of scurvy.");
    System.out.println("That'd be our lad Ben, from " + "bunk number "
        + lightestIndex + ", weighing in at " + lightest + ".");

    System.out.println(ENDING);
  }
}
