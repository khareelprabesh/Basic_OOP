package SwapValue;
public class swap_value {
      public static void main(String[] args) {
        int a = 20;
        int b = 10;
        b = a + b - (a = b);
        System.out.println(a);
        System.out.println(b);
    }
}
