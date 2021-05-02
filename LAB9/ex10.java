package example10;

public class ex10 {
    public static int m(){
        try {
            System.out.println("0");
            return 15; // не будет возращено
        } finally {
            System.out.println("1");
            return 20; // будет передано методом, так как выполняется последним
        } }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
