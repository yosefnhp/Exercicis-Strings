import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    // 1. Crear Array con 5 nombres (con valores)
    String [] arranyNoms = {"Yosef", "Javier", "Lucas", "Eloi", "Sergio"};

    // 2. Inicializar Array de notas
    double [] arranyNotes = new double[5];

    // 3. Demanar a l'usuari introduir notes
    for (int i = 0; i < arranyNotes.length; i++) {
        System.out.print("Introdueix la nota per a " + arranyNoms[i] + ": ");
        arranyNotes[i] = sc.nextDouble();
    }

    // 4. Visualitza tots els noms
    System.out.println("Noms:");
    for (int i = 0; i < arranyNoms.length; i++) {
        System.out.println(arranyNoms[i]);
    }

    // 5. Visualitza els noms amb notes
    System.out.println("Noms amb notes:");
    for (int i = 0; i < arranyNotes.length; i++) {
        System.out.println(arranyNoms[i] + ": " + arranyNotes[i]);
    }
}