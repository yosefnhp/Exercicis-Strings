import java.util.Scanner;
void main () {

    Scanner envio = new Scanner(System.in);

    System.out.print("Cuanto dinero has gastado?: ");
    double precio =  envio.nextDouble();

    if (precio >= 100.0) {
        System.out.println("Envio gratis");
    } else {
        System.out.println("El envio son 5 euros");
    }

}