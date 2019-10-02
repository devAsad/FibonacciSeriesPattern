import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        //Creating objects to call the different methods.
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fiboForLoop();
        System.out.println("For loop Ended");
        fibonacci.fiboWhileLoop();
        System.out.println("While loop ended");
        fibonacci.FiboUptoNumber();
        System.out.println("Fibonacci series Completed");
    }
    //Using For loop to print Fibonacci Series.
    public void fiboForLoop() {
        System.out.println("Fibonacci using For loop");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print the limit of Fibonacci series");
        int n = scanner.nextInt();
        System.out.println("Limit is: "+n);
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    //Using While loop to print the Fibonacci Series.
    public void fiboWhileLoop() {
        System.out.println("Fibonacci using while loop");
        System.out.println("Enter a limit to print the series");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Limit is: " + num);
        int a = 0, b = 1, i = 1, sum;
        while (i <= num) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
            i++;
        }
        System.out.println();
    }
    //Fibonacci Series upto a given number.
    public void FiboUptoNumber() {
        System.out.println("Fibonacci series upto a given number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to print a series");
        int n = scanner.nextInt();
        System.out.println("Number is: " + n);
        int a = 0, b = 1, sum;
        while (a <= n) {
            System.out.print(a+" ");
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }


}
