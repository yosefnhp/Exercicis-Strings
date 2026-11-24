public class ej2 {
    public static void main(String[] args) {
        String path = "/home/user/index.html";
        int sep = path.lastIndexOf('/');
        int dot = path.lastIndexOf('.');

        System.out.println(path.substring(dot + 1));
        System.out.println(path.substring(sep + 1, dot));
    }
}