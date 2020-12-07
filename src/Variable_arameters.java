public class Variable_arameters {

    public void test(int a, String...s){
        for (String as : s){
            System.out.println(as);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Variable_arameters v1 = new Variable_arameters();
        v1.test(3, "a","b","c");
    }
}
