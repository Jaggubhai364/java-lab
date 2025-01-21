import java.util.Scanner;
public class j3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double ppal = scanner.nextDouble();
        double roi = scanner.nextDouble();
        double time = scanner.nextDouble();

            double aintrest = ppal*(roi/100)*time;
            System.out.print("amount"+aintrest );
            scanner.close();
    }
}
