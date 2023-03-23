import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String binaryString = "";
        
        //converts string to binary
        
        for(int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            int ascii = (int)currentChar;
            String binaryConvert = Integer.toBinaryString(ascii);
            binaryString += String.format("%7s", binaryConvert).replace(' ',  '0');
        }
        
        //takes binary conversion and converts to cipher

        System.out.println("The result:");
        String norrisCipher = "";
        for(int i = 0; i < binaryString.length(); i++) {
            int count = 1;
            while(i + 1 < binaryString.length() && binaryString.charAt(i) == binaryString.charAt(i + 1)){
                i++;
                count++;
            }
            if(binaryString.charAt(i) == '0'){
                System.out.print("00 ");
            } else if (binaryString.charAt(i) == '1') {
                System.out.print("0 ");
            } else {
                continue;
            }
            for (int x = 0; x < count;x++) {
                System.out.print("0");
            }
            System.out.print(" ");
        }
    }
}
