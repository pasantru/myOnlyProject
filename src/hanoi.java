/**
 * Created by Pablo Sanchez on 14/11/2016.
 */
public class hanoi {
    public static void hanoi(int n, String a, String b, String c){
        if(n>0){
            hanoi(n-1, a, c, b);
            System.out.println("Pasar un disco de " + a + " a " + c);
            hanoi(n-1, b, a, c);
        }
    }
}
