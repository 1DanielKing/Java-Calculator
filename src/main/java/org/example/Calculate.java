public class Calculate {


int result;
int input1;
int input2;
String opInput;
public Calculate(int input1, int input2, String opInput){
    this.input1 = input1;
    this.input2 = input2;
    this.opInput = opInput;
}

    public void mathCalc(){
        switch(opInput){
            case "+":
                result = (input1 + input2);
                break;
            case "-":
                result = (input1 - input2);
                break;
            case "*":
                result = (input1 * input2);
                break;
            case "/":
                result = (input1 / input2);
                break;
            case "%":
                result = (input1 % input2);
                break;
            default:
                System.out.println("Error. Please check your input.");
        }
    }
    public void printResult(){
        System.out.println(input1 + opInput + input2 + " = " + result);
    }
}


// does not handle edge cases