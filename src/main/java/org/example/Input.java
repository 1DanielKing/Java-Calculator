import java.util.Scanner;

public class Input {
    
    String input;
    Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("Please enter your expression:  ");
        input = scanner.next();
        System.out.println();
        return input;
    }
}
