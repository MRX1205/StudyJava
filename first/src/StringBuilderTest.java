public class StringBuilderTest {
    public static void main(String[] args){
    StringBuilder s1 = new StringBuilder();
    s1.append("java");
    StringBuilder s2 = new StringBuilder(5);
    StringBuilder s3 = new StringBuilder("huangchaojian");
    System.out.println("s1:" + s1.toString() + "\tcap:" + s1.capacity());
    System.out.println("s2;" + s2.toString() + "\tcap:" + s2.capacity());
    System.out.println("s3:" + s3.toString() + "\tcap:" + s3.capacity());
    //其中 s3 的 capacity 为 25 是因为初始容量 16 + huangchaojian 的长度 9。
        /**
         * StringBuilder 常用方法：
         *
         * 方法	                     返回值	            功能描述
         * deleteCharAt(int index)	StringBuilder	删除 StringBuilder 中指定位置的 char
         * indexOf()	int	                        返回子字符串首次出现在该字符串中的索引
         * capacity()	int	                        返回当前容量
         * charAt(int index)	char	            返回序列中指定索引的 char 值
         * toString()	       String             	返回序列数据的 string 格式
         */
    }
}
