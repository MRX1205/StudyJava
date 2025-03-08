public class StringTest {
    public static void main(String[] args){
        String s0 = "abc";
        String s1 = new String("abd");
        String s2 = "Java语言";
        /***
         * length()方法
         * 调用方法：字符串标识符.length(); 返回一个 int 类型的整数（字符串中字符数，中文字符也是一个字符）
         */
        int len1 = s0.length();
        int len2 = s2.length();
        System.out.println(len1);
        System.out.println(len2);
        /**
         * equals() 方法，该方法的作用是判断两个字符串对象的内容是否相同。如果相同则返回 true，否则返回 false。
         *
         * equals() 方法比较是从第一字符开始，一个字符一个字符依次比较。
         * 如果想忽略掉大小写关系，比如：java 和 Java 是一样的，那怎么办呢？
         * 可以调用 equalsIgnoreCase() 方法，其用法与 equals() 一致，
         * 不过它会忽视大小写。
         */
        String s = new String("Java");
        String m ="java";
        System.out.println("用equals()比较，Java和java的结果为："
                +s.equals(m));
        System.out.println("用equalsIgnoreCase()比较Java和java的结果为："
        +s.equalsIgnoreCase(m));

    //而使用 "==" 比较的是两个对象在内存中存储的地址是否一样
        String ss1 = "abc";
        String ss2 = new String("abc");
        boolean b = (ss1 == ss2);
        System.out.println(b);

        /**
         * 字符串连接有两种方法：
         *
         * 使用 +，比如 String s = "Hello " + "World!"。
         * 使用 String 类的 concat() 方法。
         */
        String sss0 = new String("Hello ");
        String sss1 = "World" + "!";
        String sss2 = sss0.concat(sss1);
        System.out.println(sss2);
        /**
         * charAt() 方法的作用是按照索引值（
         * 规定字符串中第一个字符的索引值是 0，第二个字符的索引值是 1，依次类推），
         * 获得字符串中的指定字符。
         */
        String sss = "abc";
        char c = sss.charAt(1);
        System.out.println(c);

        String x = "abcdefabc";
        System.out.println("字符a第一次出现的位置为"+x.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为"+x.indexOf("bc"));
        System.out.println("字符a最后一次出现的位置为"+x.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串"+x.substring(3));
        System.out.println("从位置3开始到6之间的字符串"+x.substring(3,6));
    }

}

