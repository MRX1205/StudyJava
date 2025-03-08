import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder builder = new StringBuilder(str);
        //String str1 = builder.toString();
        //System.out.println(builder.toString());
       // System.out.println(builder.length());
        for (int x = 0; x < builder.length();x++){
            if (builder.charAt(x) == ' '){
                builder.deleteCharAt(x);
                x--;
            }
        }
        System.out.println(builder.toString());
    }
}
