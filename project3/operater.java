
public class operater {
    public static void main(String[] args) {
        int a = 4;
        double b = 2.4;
        int three = 5;

        double sum = a + b;
        double minus = a - b;
        double multipuly = a * b;
        double divide = a / b;
        int module = a % three;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multipuly);
        System.out.println(divide);
        System.out.println(module);

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);

        int x = 10;
        x++;
        System.err.println(x);
        int y = 20;
        ++y;
        System.out.println(y);
        int z = 10;
        z += x;
        System.out.println(z);
    }
}
