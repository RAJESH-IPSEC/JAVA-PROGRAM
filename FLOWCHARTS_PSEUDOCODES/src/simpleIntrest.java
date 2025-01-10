import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            float P,R,T,SI;
            System.out.println("Enter Princple amount, Rate of Intrest, Time");
            P = sc.nextFloat();
            R = sc.nextFloat();
            T = sc.nextFloat();
            SI = (P * R * T) / 100;
            System.out.println("Simple Intrest is: " + SI);
        }

    }
}
