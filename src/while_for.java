import java.util.Scanner;
void main() {
    Scanner bucles = new Scanner(System.in);

    int pincCorrecto = 1234;

    System.out.print("Indtroduce tu pin: ");

    int pinIntento = bucles.nextInt();


    while (pincCorrecto != pinIntento) {
        System.out.println("El pin es incorrecto.");
        System.out.println("");

        System.out.print("Indtroduce de nuevo tu pin: ");

        pinIntento = bucles.nextInt();
    }
    System.out.println("El pin es correcto.");

}