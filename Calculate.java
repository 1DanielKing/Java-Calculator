public class Calculate {


int result;

    public void mathCalc(int input1, String opInput, int input2){
        switch(opInput){
            case "+":
                result = (input1 + input2);
                System.out.println(input1 + opInput + input2 + " = " + result);
                break;
            case "-":
                result = (input1 - input2);
                System.out.println(input1 + opInput + input2 + " = " + result);
                break;
            case "*":
                result = (input1 * input2);
                System.out.println(input1 + opInput + input2 + " = " + result);
                break;
            case "/":
                result = (input1 / input2);
                System.out.println(input1 + opInput + input2 + " = " + result);
                break;
            case "%":
                result = (input1 % input2);
                System.out.println(input1 + opInput + input2 + " = " + result);
                break;
            default:
                System.out.println("Error. Please check your input.");
        }
    }
}
