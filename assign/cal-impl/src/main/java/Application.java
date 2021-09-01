public class Application {
    public static void main(String[] args)
    {
        Calculator calculator= new Calculator();
       System.out.println("Addition of two numbers = "+calculator.addition(13,5));
       System.out.println("Subtraction of two numbers = "+calculator.subtraction(11,8));
       System.out.println("Multiplication of two numbers = "+calculator.multiplication(14,3));
       System.out.println("Division of two numbers = "+calculator.division(16,2));
    }
}
