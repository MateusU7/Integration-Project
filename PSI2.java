
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
 */
import java.util.Scanner;
import java.lang.Math;

public class PSI2 {

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
        System.out.println("Guard: You could hire 10 men fer 20 doubloons "
                + "a brain and still have " + (int) gold % 20 + " to share!\n");

        System.out.println(NAME + " walks into the pub.");
        System.out.println(jackDialogue
                + "I need to find men for me ship! Oy user, wake up! "
                + "How many men should I recruit?");
        System.out.println("We've only got " + capital + " doubloons. "
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
            men = Math.abs(Integer.parseInt(input.nextLine()));
            counter--;
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
        System.out.println(jackDialogue + "Oy! at'll be the last coming from "
                + "you! An that's not my name! "
                + "\nGo on user, tell em what it is...");
        counter = 1;
        while (NAME.compareTo("Captain Jack Sparrow") == 0) {
            response = input.nextLine();
            if (response.equalsIgnoreCase("Captain Jack Sparrow")) {
                System.out.println(jackDialogue + "And you best remember it!");
                System.out.println((counter > 1)
                        ? " It only took ya " + counter + " tries!"
                        : "");
                break;
            } else if (response.equalsIgnoreCase("Jack Sparrow")) {
                System.out
                        .print(jackDialogue + "Don't forget I'm your Captain!");
            } else {
                System.out.print(jackDialogue + "Nope that's not it.");
            }
            System.out.println(" Try again!");
            counter += 1;
        }

        System.out.println(ending);
    }
}
