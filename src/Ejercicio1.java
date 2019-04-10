import java.util.Arrays;

public class Ejercicio1 {
static boolean sonIguales(int ar1[],int ar2[],int n){
    if (n <= 0)
        return false;
    if (n == 1) {
        if (ar1[0] == ar2[0])
            return true;
        return false;
    }
    int mid= (n)/2;
    if (n % 2 == 0) {
        boolean left= sonIguales(Arrays.copyOfRange(ar1,0,mid),Arrays.copyOfRange(ar2,0,mid),mid);
        boolean right= sonIguales(Arrays.copyOfRange(ar1,mid,ar1.length),Arrays.copyOfRange(ar2,mid,ar2.length),mid);
        if (right==true && left==true)
            return true;
        else{
            return false;
        }
    }else{
        boolean left= sonIguales(Arrays.copyOfRange(ar1,0,mid+1),Arrays.copyOfRange(ar2,0,mid+1),mid);
        boolean right= sonIguales(Arrays.copyOfRange(ar1,mid+1,ar1.length),Arrays.copyOfRange(ar2,mid+1,ar2.length),mid);
        if (right==true && left==true)
            return true;
        else{
            return false;
        }
    }





}

    public static void main(String[] args) {
    int i[]= {1,5,4,5,6};
    int j[]={1,5,4,5,6};
        System.out.println(Arrays.copyOfRange(i,0,2).length);
        System.out.println(sonIguales(i,j,5));
    }
}
