/* Mateus Urbanski
 * The following program will demonstrate the integration of basic Java concepts
 * in the manner of an adventure out of 'The Pirates of the Caribbean.'
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
 */

public class intro {

    public static void main(String[] args) {
        boolean lie = true;
        int numOfSeas = 7;
        double gold = 200.5;
        String jackDialogue = "Jack: ";
        final String NAME = "Captain Jack Sparrow";
        // final - A constant variable that cannot be changed by a method.
        String ending = "\nTo be continued...";

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
                + "meant to say " + (int) gold + ".");
        // Casting - This double is able to fit into int so it is converted.
        System.out.println(ending);

    }

}
