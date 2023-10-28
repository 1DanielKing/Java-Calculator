public class App {
    public static void main(String[] args) throws Exception {
        Input userInput = new Input();
        Calculate calc = new Calculate();

        System.out.println("Welcome to the Calculator app.");

        // get operation and reference variables


        int input1 = userInput.getInput1();
        String opInput = userInput.getOpInput();
        int input2 = userInput.getInput2();

        calc.mathCalc(input1, opInput, input2);
        

        
        // calculate
    }
}