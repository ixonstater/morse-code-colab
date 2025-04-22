public class MorseConverter {
    private final StringBuilder finalMorse = new StringBuilder();
    private final StringBuilder finalEnglish = new StringBuilder();
    public static void main(String[] args) {
    }
    public String convertToMorse(String inputMessage) {
        for (String letter: inputMessage.split("")) {
            String morse = letterToMorse(letter.toUpperCase());
            finalMorse.append(morse);
            finalMorse.append(" ");
        }
        return finalMorse.toString();
    }

    public String convertToEnglish(String inputMessage) {
        for (String morse: inputMessage.split(" ")) {
            String letter = morseToLetter(morse);
            finalEnglish.append(letter);
        }
        return finalEnglish.toString();
    }

    private String letterToMorse(String letter) {
        String morse = "";
        morse = switch (letter) {
            case "A" -> ".-";
            case "B" -> "-...";
            case "C" -> "-.-.";
            case "D" -> "-..";
            case "E" -> ".";
            case "F" -> "..-.";
            case "G" -> "--.";
            case "H" -> "....";
            case "I" -> "..";
            case "J" -> ".---";
            case "K" -> "-.-";
            case "L" -> ".-..";
            case "M" -> "--";
            case "N" -> "-.";
            case "O" -> "---";
            case "P" -> ".--.";
            case "Q" -> "--.-";
            case "R" -> ".-.";
            case "S" -> "...";
            case "T" -> "-";
            case "U" -> "..-";
            case "V" -> "...-";
            case "W" -> ".--";
            case "X" -> "-..-";
            case "Y" -> "-.--";
            case "Z" -> "--..";
            case "1" -> ".----";
            case "2" -> "..---";
            case "3" -> "...--";
            case "4" -> "....-";
            case "5" -> ".....";
            case "6" -> "-....";
            case "7" -> "--...";
            case "8" -> "---..";
            case "9" -> "----.";
            default -> morse;
        };
        return morse;
    }

    private String morseToLetter(String morse) {
        String letter = "";
        letter = switch (morse) {
            case ".-" -> "a";
            case "-..." -> "b";
            case "-.-." -> "c";
            case "-.." -> "d";
            case "." -> "e";
            case "..-." -> "f";
            case "--." -> "g";
            case "...." -> "h";
            case ".." -> "i";
            case ".---" -> "j";
            case "-.-" -> "k";
            case ".-.." -> "l";
            case "--" -> "m";
            case "-." -> "n";
            case "---" -> "o";
            case ".--." -> "p";
            case "--.-" -> "q";
            case ".-." -> "r";
            case "..." -> "s";
            case "-" -> "t";
            case "..-" -> "u";
            case "...-" -> "v";
            case ".--" -> "w";
            case "-..-" -> "x";
            case "-.--" -> "y";
            case "--.." -> "z";
            case ".----" -> "1";
            case "..---" -> "2";
            case "...--" -> "3";
            case "....-" -> "4";
            case "....." -> "5";
            case "-...." -> "6";
            case "--..." -> "7";
            case "---.." -> "8";
            case "----." -> "9";
            default -> letter;
        };
        return letter;
    }
}
