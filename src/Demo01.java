/**
 * @author BFSZ
 * @version 1.0.0
 * @className Demo01
 * @description 测试01
 * @date 2018/10/8 10:24
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(str("123", "456"));
    }


    private static double sum(double a, double b) {
        return a + b;
    }

    private static String str(String a, String b) {
        String c = a + '-' + b;
        return c;
    }
}
