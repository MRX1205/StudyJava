public class LogicOperation {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
        System.out.println("a ^ b = " + (a ^ b));
        /**
         * 逻辑运算符	名称	描述	类型	举例
         * && 或 &	与	当且仅当两个操作数都为真，条件才为真	双目运算符	(a && b) 或 (a & b) 为假
         * || 或 |	或	两个操作数任何一个为真，条件为真	双目运算符	（a || b) 或 (a | b) 为真
         * !	非	用来反转操作数的逻辑状态。如果条件为真，则逻辑非运算符将得到假	单目运算符	（!a）为假
         * ^	异或	如果两个操作数逻辑相同，则结果为假，否则为真	双目运算符	(a ^ b) 为
         */
    }
}
