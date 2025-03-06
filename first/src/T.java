/***
 * 描述
 *
 * 编写一个方法，该方法的返回值是两个不大于100的正整数的最小公倍数
 * 输入描述：
 *
 * 两个int类型变量作为方法的参数
 * 输出描述：
 *
 * int类型的变量，值为两个数的最小公倍数
 *
 */


import java.util.*;

public class T {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n){
        //write your code here......
        if (m%n==0){
            
        }
      int  x = m*n;
      if(x<100){
          return x;
      }
      return x;
    }
}

