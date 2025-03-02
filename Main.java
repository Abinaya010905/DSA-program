import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter  a string ");
        String num2 = scan.nextLine();
        System.out.println("Enter a character");
        char num3 = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
    }
}