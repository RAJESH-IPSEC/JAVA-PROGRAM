import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num,i,Count =0;
        System.out.println("Enter A Number to Check Prime or not");
        Num = sc.nextInt();
        for(i = 2; i < (Num/2); i++){
            if(Num % i == 0){
                Count++;
            }
        }
        if (Count > 0){
            System.out.println("Number is not prime");
        }
        else  {
            System.out.println("Number is prime");
        }
    }
}
