import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto y pulsa enter:");
        String texto = sc.nextLine();

        System.out.print("Texto invertido: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
}