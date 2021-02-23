public class IntOverflow {
    public static void main(String[] args) {
        int a = 2147483647;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
    }
}
