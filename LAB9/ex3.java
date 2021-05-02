package example03;

public class ex3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); // генерация сключения класса RuntimeException
        } catch (NullPointerException e) { // обработка NullPointerException
            System.out.println("1" );// небудет выведенно так как по ирархии стоит ниже RuntimeException
        }catch (RuntimeException e) { //обработка RuntimeException
            System.out.println("2" );
        }catch (Exception e) { // обработка Exception
            System.out.println("3" );
        }
        System.out.println("4");
    }
}
