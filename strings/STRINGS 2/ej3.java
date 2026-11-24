public class ej3 {
    public static void main(String[] args) {
        String texto = "w3resource";

        if (texto.length() < 2) {
            System.out.println("");
        } else {
            String inicio = texto.substring(0, 2);
            String finalTexto = texto.substring(texto.length() - 2);
            System.out.println(inicio + finalTexto);
        }
    }
}