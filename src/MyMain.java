import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int sum = a + b;
        try{
            if(sum < 150) {
                throw new MyFirstException("Custom Exception Occurred");
            }else {
                System.out.println("sum = " + sum);
            }
        }catch (MyFirstException e){
                System.out.println(e);
                e.printStackTrace();
        }
    }
}
