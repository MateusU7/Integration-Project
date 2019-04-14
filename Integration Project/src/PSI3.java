
/* Mateus Urbanski
 * The following program will demonstrate the integration of basic Java concepts
 * in the manner of an adventure out of 'The Pirates of the Caribbean.'
 * Driver class - "...the program"
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

import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class PSI3 {

    /*
     * Below is a header public is an access modifier void is the return type,
     * meaning this method doesn't return anything method names should be in
     * lowerCamelCase and be named with a verb
     */
    public static void main(String[] args) {
        String jackDialogue = "Jack: ";
        final String NAME = "Captain Jack Sparrow";
        // final - A constant variable that cannot be changed by a method.
        String ending = "\nTo be continued...";
        boolean lie = true;
        int numOfSeas = 7;
        double gold = 210.5;
        int capital = Ship.getCapital();
        int men;
        String summary;
        int counter = 0;
        String response;
        int menJumpOff;
        int newMen;
        int accumulator = 0;
        int lightest;
        int lightestIndex;
        String destination;
        String direction = "";
        int index = 0;
        Scanner input = new Scanner(System.in);

        System.out.println(jackDialogue + "Ahoy there user! Try and keep up.");
        System.out.println();
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
        System.out.println(
                "Guard: My days! You could hire 10 men fer 20 doubloons "
                        + "a brain and still have " + (int) gold % 20
                        + " to share!\n");

        System.out.println(NAME + " walks into the pub.");
        System.out.println(jackDialogue
                + "I need to find men for me ship! Oy user, wake up! "
                + "How many men should I recruit?");
        System.out.println("We've got " + capital + " doubloons. "
                + "Each man costs 20 doubloons to hire.");
        System.out
                .println("Keep in mind a Sloop holds 1-4, a Brig carries 5-10,"
                        + " and a Galleons fits 11-20.");
        System.out.println("A Sloop costs 200, a Brig costs 400, and "
                + "a Galleon costs 600 doubloons.\n");

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

        switch (men) {
            case 0:
                System.out.println(jackDialogue + "Well looks like Jackie boy "
                        + "is all alone yet again.");
                break;
            /*
             * The break statement prevents the statement from 'falling through'
             * by exiting the switch statement and proceeding to the next print
             * statement
             */
            default:
                System.out.println(jackDialogue + "Let's make sure I haven't "
                        + "left a lad! Let me count it up...");
                for (counter = 1; counter <= men; counter++) {
                    System.out.println(counter);
                    if (counter != men) {
                        continue;
                        /*
                         * This continue is used to skip the following print
                         * statement for every iteration that is not the last
                         */
                    }
                    System.out.println("Looks like we've got everyone!");
                }
        }

        System.out.println("\nJack's Parrot: *SQUAWK* My name's Jack and I "
                + "need friends to affirm my purpose in life *SQUAWK*");
        System.out.println(jackDialogue + "Oy! At'll be the last coming from "
                + "you! An that's not my name! "
                + "\nGo on user, tell em what it is...");
        counter = 1;
        while (NAME.compareTo("Captain Jack Sparrow") == 0) {
            response = input.nextLine();
            if (response.equalsIgnoreCase("Captain Jack Sparrow")) {
                System.out.println(jackDialogue + "And you best remember it!");
                System.out.println(
                        (counter > 1) ? "It only took ya " + counter + " tries!"
                                : "");
                break;
                /*
                 * The break statement ensures that once the correct name is
                 * given, the infinite while loop ends
                 */
            } else if (response.equalsIgnoreCase("Jack Sparrow")) {
                System.out
                        .print(jackDialogue + "Don't forget I'm your Captain!");
            } else {
                System.out.print(jackDialogue + "Nope that's not it.");
            }
            System.out.println(" Try again!");
            counter += 1;
        }
        input.close();

        ArrayList<String>[] location = new ArrayList[2];
        location[0] = new ArrayList();
        location[1] = new ArrayList();
        location[0].add("Port Royal");
        location[0].add("St. Mary's Island");
        location[0].add("Clew Bay");
        location[1].add("New Providence");
        location[1].add("Barataria Bay");
        location[1].add("Palm Cove");
        System.out.println(
                "\nIt was now time for Jack to decide on his desired location.");
        System.out.println("3 plundering hotspots laid in the North and 3 in "
                + "the South.");
        Random random = new Random();
        destination = location[random.nextInt(1)].get(random.nextInt(2));
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                if (destination == (location[r].get(c))) {
                    switch (r) {
                        case 0:
                            direction = "North";
                            break;
                        case 1:
                            direction = "South";
                    }
                    index = c + 1;
                    break;
                }
            }
        }
        System.out.println("After several flips of a coin, Jack set "
                + "sail for " + destination + ", location number " + index
                + " to the " + direction + ".");
        if (men > 4) {
            menJumpOff = men - 4;
            System.out.println("They " + "passed the Siren Isles and "
                    + menJumpOff + " heard their "
                    + "song and took a plunge. 4 men remained.");
        } else if (men < 4) {
            newMen = 4 - men;
            System.out.println("After stopping in Tortuga Bay for a pit stop, "
                    + newMen + " men volunteered to crew. The ship was now "
                    + "manned with 4.");
        }
        Sailor jack = new Sailor("Captian", "Jack Sparrow", 190);
        Sailor william = new Sailor("First Mate", "William Turner", 200);
        Sailor bootstrap = new Sailor("Gunner", "Bootstrap Bill", 220);
        Sailor ben = new Sailor("Navigator", "Benjamin Heart", 180);
        int[] weights = { jack.getWeight(), william.getWeight(),
                bootstrap.getWeight(), ben.getWeight() };
        for (int i : weights) {
            accumulator += i;
        }
        lightest = weights[0];
        lightestIndex = 0;
        for (int j = 0; j < weights.length; j++) {
            if (weights[j] < lightest) {
                lightest = weights[j];
                lightestIndex = j;
            }
        }
        System.out.println(jackDialogue + "Well men, with all this fog we'll be"
                + " needing one of us to climb up the ol' rickety crow's nest.");
        System.out.println("I propose it be the lightest of our " + accumulator
                + " overall pounds of scurvy. That'd be our lad Ben, from "
                + "bunker number " + lightestIndex + ", weighing in at "
                + lightest + ".");

        System.out.println(ending);
    }
}
