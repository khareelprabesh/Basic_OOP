public class doWhile_loop {
    public static void main(String[] args) {
        int num = 5;
        do {
            if (num == 1) {
                System.out.print(num + " ");
            }
            else {
                System.out.print(num + ", ");
            }
            num--;
        } while (num != 0);
    }
}
