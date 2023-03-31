import java.util.Scanner;

public class Calcy {
    public static void main(String[] args) {
        int number1,number2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First Number");
        number1= scanner.nextInt();
        System.out.println("Enter the Second Number");
        number2= scanner.nextInt();
        System.out.println("Add: +");
        System.out.println("Sub: -");
        System.out.println("Mul: X");
        System.out.println("Div: +");
        System.out.println("Mod: %");
        System.out.println("Add: <");
        System.out.println("Greater: >");
        System.out.println("Less: X");
        System.out.println("equal: +");
        System.out.println("Not equal: %");
        String operation= scanner.next();
        char op=operation.charAt(0);
        switch (op)
        {
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case 'X':
                System.out.println(number1*number2);
                break;
            case '/':
                if (number1>number2) {
                    System.out.println(number1 + number2);
                }
                break;
            case '%':
                if (number1>number2) {
                    System.out.println(number1 % number2);
                }
                break;
            case '<':
                System.out.println(number1 < number2);
                break;
            case '>':
                System.out.println(number1 > number2);
                break;
            case '=':
                System.out.println(number1 == number2);
                break;
            case '!':
                System.out.println(number1 != number2);
                break;
            default:
                System.out.println("Error");
        }
    }
}
