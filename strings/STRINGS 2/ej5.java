public class ej5 {
    public static void main(String[] args) {
        String[] palabras = {"sol", "ordenador", "clase", "programacion", "java"};
        String masLarga = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
        }

        System.out.println("Palabra mas larga: " + masLarga);
        System.out.println("Longitud: " + masLarga.length());
    }
}