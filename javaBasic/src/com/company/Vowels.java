import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter String ~ ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String input = inputStr.replaceAll("\\s/g", "").toLowerCase();
        char[] charArr = input.toCharArray();
        int noOfVowels = 0, noOfCons = 0;
        for (char x : charArr) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                noOfVowels++;
            } else {
                noOfCons++;
            }
        }
        System.out.println("Vowels are " + noOfVowels + " & Cons are " + noOfCons);
    }
}
