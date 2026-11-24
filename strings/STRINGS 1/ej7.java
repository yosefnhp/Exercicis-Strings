void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Que lenguaje estmos usando?"); //a, b, c, d
    System.out.println("a. python");
    System.out.println("b. HTML");
    System.out.println("c. Java");
    System.out.println("d. C++");

    String respuesta = sc.nextLine();

    if (respuesta.equals("c")) {
        System.out.println("Respuesta correcta!");
    } else if (respuesta.equals("a") || respuesta.equals("b") || respuesta.equals("d")) {
        System.out.println("Respuesta incorrecta, la respuesta correcta es la C.");
    } else {
        System.out.println("Respuesta no valida.");
    }
}