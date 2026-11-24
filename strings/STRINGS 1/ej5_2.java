import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo", "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe palabra o palabras del título del libro que quieres buscar:");
        String busq = sc.nextLine().toLowerCase();

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].toLowerCase().contains(busq)) {
                System.out.println(catalogo[i]);
            }
        }
    }
}