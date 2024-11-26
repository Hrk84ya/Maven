package calculator;
public class App 
{
    public static void main( String[] args )
    {
        Calculator calc=new Calculator();
        System.out.println("Addition: "+calc.addition(8,9));
        System.out.println("Substraction: "+calc.substract(9,8));
        System.out.println("Multiplication: "+calc.multiply(8,9));
        System.out.println("Division: "+calc.divide(8,9));
    }
}