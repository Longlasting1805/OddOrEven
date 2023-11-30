import java.util.Scanner;

public class FindOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is a even number");
        }else {
            System.out.println(number + " is a odd number");
        }
    }
}
