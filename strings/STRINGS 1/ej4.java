import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        if (!texto.isEmpty()) {
            System.out.println("Introduce una palabra:");
            String palabra = sc.nextLine();

            if (texto.contains(palabra)) {
                System.out.println("La palabra esta en el texto");
            } else {
                System.out.println("No se ha encontrado la palabra");
            }
        }
    }
}