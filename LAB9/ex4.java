package example04;

public class ex4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" ); // не будет обработано, стоит после RuntimeException
        }catch (Exception e) { // будет обработано, стоит выше RuntimeException
            System.out.println("2" );
        }catch (Error e) { // не будет обработанно, исключения другой ветви Throwable
            System.out.println("3" );
        }
        System.out.println("4");
    }


}
