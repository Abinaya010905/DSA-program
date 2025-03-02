

import java.util.Scanner;
class hello{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a input x");
        int x = scan.nextInt();
        System.out.println("Enter a input y");
        int y = scan.nextInt();
        scan.close();

        for (int i=0; i < y; i++) {
            System.out.println(x);
        }


    }
}