import java.util.Scanner;
void main() {

String EstadoPedido = "PENDIENTE";

    switch (EstadoPedido) {
        case "ENVIADO":
            System.out.println("El pedido esta de camino");
            break;
        case "PENDIENTE":
            System.out.println("El pedido esta pendiente");
            break;
        case "ENTREGADO":
            System.out.println("El pedido esta entregado");
            break;
        default:
            System.out.println("Estado desconocido");
    }


}