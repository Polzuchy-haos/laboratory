package example07;

public class ex7 {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            throw new ArithmeticException(); // будет перехвачено JVM так как необходим новый обработчик для перехвата
        } catch (ArithmeticException e) {
                System.out.println("2");
        }
        System.out.println("3");

    }

}


