public class ej2 {
    public static void main(String[] args) {
        String texto = "google.com";
        char[] letras = new char[texto.length()];
        int[] veces = new int[texto.length()];
        int total = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int pos = -1;

            for (int j = 0; j < total; j++) {
                if (letras[j] == c) {
                    pos = j;
                }
            }

            if (pos != -1) {
                veces[pos]++;
            } else {
                letras[total] = c;
                veces[total] = 1;
                total++;
            }
        }

        System.out.print("{");
        for (int i = 0; i < total; i++) {
            System.out.print("'" + letras[i] + "': " + veces[i]);
            if (i < total - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}