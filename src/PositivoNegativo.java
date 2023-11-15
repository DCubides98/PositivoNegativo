import java.util.Scanner;

public class PositivoNegativo {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        double num1 = scanner.nextDouble();

        if (num1 >=0){
            System.out.println("Es positivo");
        }
        else
            System.out.println("Es negativo");

        scanner.close();
    }
}