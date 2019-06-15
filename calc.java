import java.util.*;

public class  calculator
{
    public static void main(string[] args)
    {
      int num1=0;
      int num2=0;
      char operator;
      double answer = 0.0;

      scanner scanObject = new scanner (system.in);

      system.out.printin("please enter first number");
      num1 = scanObject.nextint();
      System.out.printin("please enter second number");
      num2 = scanObject.nextint();
      system.out.printin("what operation?");
      operator = scanObject.next().charat(0);

      switch (operator) {
        case '+': answer = num1 + num2;
          break;
        case '-': answer = num1 - num2;
          break;
        case '*': answer = num1 * num2;
          break;
        case '/': answer = num1/num2;
          break;
      }

      system.out.printin(num1+" "+operator+" "+num2+" = "+answer);
    }
}
