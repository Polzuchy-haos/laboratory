package example12;

public class ex12 {
    public static void m(String str, double chislo){
        if (str==null) { // сравнение строк
            throw new IllegalArgumentException("Строка введена неверно"); //при указатели на строку равном null производим исключение
        }
        if (chislo>0.001) {// сравнение чисел
            throw new IllegalArgumentException("Неверное число"); // при выполнения условий генерируем исключение
        } }
    public static void main(String[] args) {
        m(null,0.000001);// передача аргументов
    }
}
