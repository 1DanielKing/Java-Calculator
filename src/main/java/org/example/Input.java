import java.util.Scanner;

public class Input {
    //String input1;
    //String input2;
    int input1;
    int input2;
    String opInput;
    Scanner scanner = new Scanner(System.in);

    public int getInput1() {
        System.out.print("Please enter your first number:  ");
        input1 = scanner.nextInt();
        System.out.println();
        return input1;
    }
    public String getOpInput() {
        System.out.println("What operation would you like to perform?");
        System.out.print("Options are: + - * / % . Enter here:  ");
        scanner.nextLine();
        opInput = scanner.nextLine();
        System.out.println();
        return opInput;
    }
    public int getInput2() {
        System.out.print("Please enter your second number:  ");
        input2 = scanner.nextInt();
        System.out.println();
        return input2;
    }
}
