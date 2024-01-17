public class fib {
    public static int fib(int n) {
        int pre = 0, cur = 1, sum=0;
        for (int i = 0; i < n-2; i++) {
            sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(fib.fib(4));
    }
}
