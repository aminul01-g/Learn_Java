
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number: ");
        num = input1.nextInt();
        System.out.println("Number = "+num);


        Scanner input2 = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = input2.nextLine();
        System.out.println("HI! "+name);

        Scanner input3 = new Scanner(System.in);
        double dnum;
        System.out.print("Enter your name: ");
        dnum = input3.nextDouble();
        System.out.println("Double Num = "+dnum);
    }
}
