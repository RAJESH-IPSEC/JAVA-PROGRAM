import java.util.Scanner;

public class findMaxOf3 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int A,B,C;
        System.out.println("Enter A, B, C VALUE");
        A = SC.nextInt();
        B = SC.nextInt();
        C = SC.nextInt();
        if(A > B && A > C){
            System.out.println("Max Num is: " + A);
        }
        else if (B > A && B > C) {
            System.out.println("Max Num is: " + B);
        }
        else {
            System.out.println("Max Num is: " + C);
        }
    }
}
