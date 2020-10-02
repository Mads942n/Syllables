
import java.util.Scanner;

public class Syllables {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String UserInput = input.next();


        int syllableCount = 0;


        for (int i = 0; i < UserInput.length() - 1; i++) {


            final boolean b = UserInput.charAt(i + 1) != ('a') || UserInput.charAt(i + 1) != ('e') ||
                    UserInput.charAt(i + 1) != ('i') || UserInput.charAt(i + 1) != ('o') || UserInput.charAt(i + 1) != ('u')
                    || UserInput.charAt(i + 1) != ('y');
            final boolean c = UserInput.charAt(i + 1) == ('a') || UserInput.charAt(i + 1) == ('e') ||
                    UserInput.charAt(i + 1) == ('i') || UserInput.charAt(i + 1) == ('o') || UserInput.charAt(i + 1) == ('u')
                    || UserInput.charAt(i + 1) == ('y');

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
        if (UserInput.charAt(UserInput.length() - 1) == 'a' || UserInput.charAt(UserInput.length() - 1) == 'e' ||
                UserInput.charAt(UserInput.length() - 1) == 'i' || UserInput.charAt(UserInput.length() - 1) == 'o' ||
                UserInput.charAt(UserInput.length() - 1) == 'u' || UserInput.charAt(UserInput.length() - 1) == 'y') {
            syllableCount = syllableCount + 1;
        }
        if (UserInput.charAt(UserInput.length() - 1) == 'e') {

            syllableCount = syllableCount - 1;
        }

        if (syllableCount <= 0) {
            syllableCount = 1;
        }

        System.out.println(UserInput);
        System.out.println(syllableCount);

        }
    }

