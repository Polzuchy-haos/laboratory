package example08;

public class ex8 {
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException(); //генерация исключения, обработки нет, JVM возьмет это на себя
        } finally {
            System.out.println("1"); //выполнится в любом случае, находиться в блоке finally
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}
 /*
 Exception in thread "main" java.lang.RuntimeException - появилось исключение
	at example08.ex8.m(ex8.java:7) - находиться в методе м
	at example08.ex8.main(ex8.java:12) - находиться в методе main
	прослеживается иеархия отображения
0
1
  */