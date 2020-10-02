
import java.util.Scanner;

public class Syllables {


    public static void main(String[] args) {


        //Defining the scanner.
        Scanner input = new Scanner(System.in);

        //Defining the datatype, that the input is converted to.
        String UserInput = input.next();

        //Defining, and initializing the counter for the syllables.
        int syllableCount = 0;


        //For loop that goes until the end of the string.
        for (int i = 0; i < UserInput.length() - 1; i++) {


            //This first boolean checks if there is not a vowel in front of currently selected letter.
            final boolean b = UserInput.charAt(i + 1) != ('a') || UserInput.charAt(i + 1) != ('e') ||
                    UserInput.charAt(i + 1) != ('i') || UserInput.charAt(i + 1) != ('o') || UserInput.charAt(i + 1) != ('u')
                    || UserInput.charAt(i + 1) != ('y');
            //This boolean checks if there is a vowel in front of the currently selected letter.
            final boolean c = UserInput.charAt(i + 1) == ('a') || UserInput.charAt(i + 1) == ('e') ||
                    UserInput.charAt(i + 1) == ('i') || UserInput.charAt(i + 1) == ('o') || UserInput.charAt(i + 1) == ('u')
                    || UserInput.charAt(i + 1) == ('y');

            //These first if, and else if statements check for vowel combinations, and only adds a syllable if there,
            //Are no vowels next to eachother.
            if (UserInput.charAt(i) == 'a' && b && !c) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'e' && b && !c) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'i' && b && !c) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'o' && b && !c) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'u' && b && !c) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'y' && b && !c) {
                syllableCount = syllableCount + 1;

            }


            //These if, and else if statements, checks for 2 vowels next to eachother and count them as one syllable.
            if (UserInput.charAt(i) == 'a' && c && !b) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'e' && c && !b) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'i' && c && !b) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'o' && c && !b) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'u' && c && !b) {
                syllableCount = syllableCount + 1;

            } else if (UserInput.charAt(i) == 'y' && c && !b) {
                syllableCount = syllableCount + 1;

            }

        }

        //This if statement, checks the last letter in the word, if its a vowel, and then adds a syllable.
        if (UserInput.charAt(UserInput.length() - 1) == 'a' || UserInput.charAt(UserInput.length() - 1) == 'e' ||
                UserInput.charAt(UserInput.length() - 1) == 'i' || UserInput.charAt(UserInput.length() - 1) == 'o' ||
                UserInput.charAt(UserInput.length() - 1) == 'u' || UserInput.charAt(UserInput.length() - 1) == 'y') {
            syllableCount = syllableCount + 1;
        }

        //This if statement, checks if the last letter is 'e', and if it is it removes, 1 syllable.
        if (UserInput.charAt(UserInput.length() - 1) == 'e') {

            syllableCount = syllableCount - 1;
        }

        //This if statement, makes sure the word always has at least 1 syllable.
        if (syllableCount <= 0) {
            syllableCount = 1;
        }


        //And finally i print out, the user input, and the syllable count.
        System.out.println(UserInput);
        System.out.println(syllableCount);

        }
    }

