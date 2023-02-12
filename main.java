import java.util.Scanner;

public class Main {
    static void convertBinary(String string) {
        System.out.println("The result:");
        for (int char_ = 0; char_ < string.length(); char_++) {
            char currentChar = string.charAt(char_);
            int ascii = (int)currentChar;
            String binaryString = Integer.toBinaryString(ascii);
            System.out.println(currentChar + " = " + String.format("%7s", binaryString).replace(' ',  '0'));
        }
    }    
    
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        convertBinary(string);
    }
}
