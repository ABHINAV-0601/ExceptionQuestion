import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        try{
            if(sum < 150) {

                throw new MyFirstException("Custom Exception Occurred");

            }else {
                System.out.println("sum = " + sum);
            }
        }catch (MyFirstException e){
                System.out.println(e);
                e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
