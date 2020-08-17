import javax.imageio.stream.IIOByteBuffer;
import java.util.Iterator;

public class array_test {
    public static void main(String[] args) {
        /*
        定义数组必须初始化
        静态初始化，显式的指定数组中的元素
        动态初始化，只指定长度，系统为数组分配初始值
         */
        //静态初始化
        int[] array1 = new int[]{1,2,3,4,5,6,7,8};
        int[] array2 = {1,2,3,4,5,6,7,8};

        //动态初始化
        int[] array3 = new int[8];

        //数组长度
        System.out.println(array3.length);

        //访问数组
        System.out.println(array1[0]);
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        for(int i : array1){
            System.out.println(i);
        }

        //多为数组
        int[][] q = new int[3][2];

        //相当于a是长度为3的一维数组
        int[][] a = new int[3][];
        for (int i = 0; i < a.length; i++){
            System.out.println(i);
        }
        //每一维又可以做一个引用指向数组
        a[0] = new int[5];

    }
}
