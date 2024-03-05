import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A, B;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input numbers A and B: ");
        A = scan.nextDouble();
        B = scan.nextDouble();
        if (B > 0 && A > B){
            int BinsideA = 0;
            for (double i = B; i <= A; i += B){
                BinsideA++;
            }
            System.out.printf("%s fits into %s %s time(-s)", B, A, BinsideA);
        }
        else System.out.println("Incorrect input");
    }
}