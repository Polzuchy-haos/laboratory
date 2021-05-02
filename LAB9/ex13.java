package example13;

public class ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length; // размер массива равен нулю
            System.out.println("размер массива= " + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль"); // обработка деления на ноль
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
