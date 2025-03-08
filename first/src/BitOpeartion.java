public class BitOpeartion {
    public static void main(String[] args){
        int a = 60;
        int b = 13;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));
        /**
         * 位运算符	            名称	            描述	                    举例
         * &	  按位与	如果相对应位都是 1，则结果为 1，否则为 0	（a＆b），得到 12，即 0000 1100
         * 丨	按位或	如果相对应位都是 0，则结果为 0，否则为 1	（ a 丨 b ）得到 61，即 0011 1101
         * ^	按位异或	如果相对应位值相同，则结果为 0，否则为 1	（a^b）得到 49，即 0011 0001
         * ~	按位补	翻转操作数的每一位，即 0 变成 1，1 变成 0	（~a）得到 -61，即 1100 0011
         * <<	按位左移	左操作数按位左移右操作数指定的位数	a<<2 得到 240，即 1111 0000
         * >>	按位右移	左操作数按位右移右操作数指定的位数	a>>2 得到 15 即 1111
         * >>>	按位右移补零	左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充	a>>>2 得到 15 即 0000 1111
         */
    }
}
