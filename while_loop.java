public class while_loop {
    public static void main(String[] args) {
        int num = 3;
        int i = 1;
        while (i <= 5) {
            if (i == 5) { 
                System.out.print((num * i) + " ");
            }
            else {
                System.out.print((num * i) + ", ");
            }
            i++;
        }
    }
}
