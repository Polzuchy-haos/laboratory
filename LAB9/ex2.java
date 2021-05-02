package Example02;

public class ex2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); // строка не будет ввыедена так как уже сгенерировано исключение
        } catch (Exception e) {
            System.out.println("2 "+ e );
        }
        System.out.println("3");
    }
}
