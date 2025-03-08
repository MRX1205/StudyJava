import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入x1的值为：");
        int x1 = scanner.nextInt();
        System.out.print("请输入x2的值为：");
        int x2 = scanner.nextInt();
        int sum = x1 + x2;
        System.out.println("sum = " + sum);

    }
}
