import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.print(string.replace("", " "));
    }
}
