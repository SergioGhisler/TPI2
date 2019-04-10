import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    static int resultado(int arr[],int n) {
        ArrayList parejas = new ArrayList();
        int mid = arr.length / 2;

        //si es un valle
        if (arr[mid - 1] > arr[mid] && arr[mid + 1] > arr[mid]) {

            int d = getPeakDerecha(Arrays.copyOfRange(arr, mid, arr.length));

            int[] aux1 = {arr[mid], d};
            parejas.add(aux1);
            int i = getPeakIzquierda(Arrays.copyOfRange(arr, 0, mid));
            int[] aux2 = {arr[mid], i};
            parejas.add(aux2);
        }


    }




    public static int getPeakDerecha(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                return arr[i];
            }
        }
        return Integer.parseInt(null);
    }

    public static int getPeakIzquierda(int arr[]) {

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                return arr[i];
            }
        }
        return Integer.parseInt(null);
    }

    public static int getValleyDerecha(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {
                return arr[i];
            }
        }
        return Integer.parseInt(null);
    }

    public static int getValleyIzquierda(int arr[]) {

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) {
                return arr[i];
            }
        }
        return Integer.parseInt(null);
    }
//    public static void GetValleysAndPeaks(int[] yValues)
//    {
//        ArrayList peakIndexes= new ArrayList();
//        ArrayList valleyIndexes= new ArrayList();
//
//
//        boolean directionUp = yValues[0] <= yValues[1];
//        for(int i = 1; i < yValues.length - 1; i++)
//        {
//            if(directionUp && yValues[i + 1] < yValues[i])
//            {
//                peakIndexes.add(i);
//                directionUp = false;
//            }
//            else if(!directionUp && yValues[i + 1] > yValues[i])
//            {
//                valleyIndexes.add(i);
//                directionUp = true;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 3, 8, 5, 2, 4, 1, 3, 5, 8, 4};
        resultado(arr);
    }
}
