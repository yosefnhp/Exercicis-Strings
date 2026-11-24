import java.util.Scanner;
void main () {

   Scanner teclado = new Scanner (System.in);



    System.out.print("Que edad tienes? ");
    int edad = teclado.nextInt();

    System.out.print("Cuanto saldo tienes? ");
    double saldo = teclado.nextDouble();

    if (edad >= 18 && saldo >= 12.0) {
        System.out.println("Puedes entrar al festival!");
    } else {
        System.out.println("No puedes entrar.");
    }



}