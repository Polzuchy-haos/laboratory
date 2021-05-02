package example05;

public class ex5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { //не будет перехваченно, иерично стоит ниже RuntimeException
            System.out.println("1" ); // поэтому JVM перехватит исключение сама
        }
        System.out.println("2");
    }
}
