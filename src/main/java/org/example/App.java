public class App {
    public static void main(String[] args) throws Exception {
        Input userInput = new Input();
        

        System.out.println();
        System.out.println("Welcome to the Calculator app.");
        System.out.println();

        // get operation and reference variables


        int input1 = userInput.getInput1();
        String opInput = userInput.getOpInput();
        int input2 = userInput.getInput2();

        Calculate calc = new Calculate(input1, input2, opInput);
        calc.mathCalc();
        calc.printResult();
        System.out.println();
        

        
        // calculate
    }
}