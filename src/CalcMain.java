import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputstr = sc.next();
        String[] operands = inputstr.split("[\\+\\-\\*/]");
        if(operands.length>1){
        char operation = inputstr.charAt(operands[0].length());
        double res = 0;
        switch (operation) {
            case '+':
                res = Double.valueOf(operands[0]) + Double.valueOf(operands[1]);
                break;
            case '-':
                res = Double.valueOf(operands[0]) - Double.valueOf(operands[1]);
                break;
            case '*':
                res = Double.valueOf(operands[0]) * Double.valueOf(operands[1]);
                break;
            case '/':
                res = Double.valueOf(operands[0]) / Double.valueOf(operands[1]);
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println(res);}
        else System.out.println("Incorrect input string");
        sc.close();
    }
}