import java.util.Scanner;

public class while_for2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
        } while (numero != 0); // Se repite mientras sea diferente de 0

        System.out.println("¡Programa terminado!");
        scanner.close();
    }
}
