public class for_label {
    public static void main(String[] args) {
        /*
          java中的标签就是紧跟着英文冒号的的标识符,标签可以自定义
          通过标签结束外层循环,或跳出一次外循环
          也可以用return结束循环
         */
        outer:
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (i == 6){
                    System.out.println("i == 6");
                    break outer;

                }else if(j == 6){
                    System.out.println("j == 6");
                    continue outer;
                }
            }
        }
        System.out.println("循环跳出");
    }
}

