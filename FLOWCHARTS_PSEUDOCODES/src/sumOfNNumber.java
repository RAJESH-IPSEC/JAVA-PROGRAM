import java.util.Scanner;

public class sumOfNNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num, Sum = 0,i;
        System.out.println("Enter a number to calculate sum no that");
        Num = sc.nextInt();
        for (i = 1; i <= Num; i++){
            Sum = i + Sum;
        }
        System.out.println("Sum Is: " + Sum);
    }
}
