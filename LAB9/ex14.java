package example14;

public class ex14 {
    public static void m(int x) throws ArithmeticException{ // указание компилятору что нежно обрабоать этот метод
        int h=10/x;                                         // на исключение типа ArithmeticException
    }
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l); // обработка исключения
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
