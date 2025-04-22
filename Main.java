import java.util.Scanner;

public class Main {
    static String inputMessage = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message you want converted: ");
        inputMessage = scanner.nextLine();
        MorseConverter morseConverter = new MorseConverter();

        String finalMorse = morseConverter.convertToMorse(inputMessage);
        System.out.println(finalMorse);

        String finalMessage = morseConverter.convertToEnglish(".... . .-.. .-.. ---");
        System.out.println(finalMessage);

    }
}
