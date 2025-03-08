public class RealtionalOperation {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <=b = " + (a <= b));
        /**
         * 布尔表达式 ？表达式 1 : 表达式 2;
         * 运算过程：如果布尔表达式的值为 true，则返回表达式 1的值，否则返回表达式 2的值。
         */
        System.out.println("a > b ? a:b = " + (a > b ? a:b));
    }
}
