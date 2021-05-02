package example09;

public class ex9 {
    public static int m(){
        try {
            System.out.println("0");
            return 55; // выход из метода
        } finally {
            System.out.println("1"); //сработает этот блок, после чего главные метод получит возращеное число
        } }
    public static void main(String[] args) {
        System.out.println(m()); // выведет после обработки finally
    }
}
