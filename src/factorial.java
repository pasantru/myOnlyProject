/**
 * Created by Pablo Sanchez on 12/11/2016.
 */
public class factorial{
    public int factorial(int n){
        if(n == 0) return 1;
        else return n*factorial(n-1);
    }
}
