public class Draw {
    public static void main(String[] args){
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("恭喜你，获得了一等奖");
                break;
            case 2:
                System.out.println("恭喜你，获得了二等奖");
                break;
            case 3:
                System.out.println("恭喜你，获得了三等奖");
                break;
            default:
                System.out.println("很遗憾，没有中奖");
        }
        /**
         * switch(表达式){
         *     case 值1:
         *         代码块1
         *         break;
         *     case 值2:
         *         代码块2
         *         break;
         *     ...
         *     default:
         *         默认执行的代码块
         * }
         */
    }
}
