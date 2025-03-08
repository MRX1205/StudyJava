public class SumOfEven {
    public static void main(String[] args){
        int x1 = 1, x2 =1;
        int sum1 = 0, sum2 = 0,sum3 = 0;
        /**
         *while(条件){
         *     代码块
         * }
         * while 的执行过程是先判断，再执行。
         *
         * 判断 while 后面的条件是否成立 ( true or false )
         * 当条件成立时，执行循环内的代码
         */
        while(x1 <= 1000){
            if (x1 % 2 == 0){
                sum1 += x1;
            }
            x1++;

        }
        System.out.println("用while循环计算1-1000的偶数和sum1 = " + sum1);
        /**
         * do{
         *     代码块
         * }while(条件);
         * do-while 的执行过程是先执行一次，再循环判断（所以循环内的代码至少会执行一次）。
         *
         * 先执行一遍循环操作，然后判断循环条件是否成立。
         * 如果条件成立，继续执行1、2，直到循环条件不成立为止。
         */
        do {
            if(x2 % 2 == 0){
                sum2 += x2;
            }
            x2++;

        }while (x2 <= 1000);
        System.out.println("用do while循环计算1-1000偶数sum2 = " + sum2);
        /**
         * for(循环变量初始化①; 循环条件②; 循环变量值操作③){
         *     循环操作④
         * }
         * for 相比 while 和 do-while 语句结构更加简洁易读，它的执行顺序：
         *
         * 执行循环变量初始化部分（1），设置循环的初始状态，此部分在整个循环中只执行一次。
         * 进行循环条件的判断（2），如果条件为 true，则执行循环体内代码（4）；如果为 false ，则直接退出循环。
         * 执行循环变量值操作部分（3），对循环变量的值进行修改，然后进行下一次循环条件判断（2）。
         */
        for (int x3 = 1; x3 <= 1000; x3++){
            if (x3 % 2 == 0){
                sum3 += x3;
            }
        }
        System.out.println("用for循环计算1-1000偶数sum3 = " + sum3);
    }
}
