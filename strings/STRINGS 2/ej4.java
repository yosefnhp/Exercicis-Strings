public class ej4 {
    public static void main(String[] args) {
        String texto = "string";

        if (texto.length() >= 3) {
            if (texto.endsWith("ing")) {
                texto = texto + "ly";
            } else {
                texto = texto + "ing";
            }
        }

        System.out.println(texto);
    }
}