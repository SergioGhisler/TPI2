import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio3 {

    static int[][] getTraspuesta(int[][] m,int n){

        if(n==1){
            return m;
        }
        else if(n==2){
          int [][]c=new int[][]{{m[0][0], m[1][0]},{m[0][1],m[1][1]}};
            return c;
        }else {
            if (n % 2 == 0) {
                int aux = n / 2;
                ArrayList<int[][]>div= splitM(m,m.length);
                int [][] c;

                int[][] primerCuadrante = getTraspuesta(div.get(0),aux);
                int[][] segundoCuadrante = getTraspuesta(div.get(1),aux);
                int[][] tercerCuadrante = getTraspuesta(div.get(2),aux);
                int[][] cuartoCuadrante = getTraspuesta(div.get(3),aux);
                int traspuesta[][] =new int[primerCuadrante.length*2][primerCuadrante.length*2];
                int contador=0;
                    for(int i=0;i<primerCuadrante.length*2;i++)
                    {
                        if(i<primerCuadrante.length) {
                            System.arraycopy(primerCuadrante[i], 0, traspuesta[i], 0, primerCuadrante[i].length);
                            System.arraycopy(segundoCuadrante[i], 0, traspuesta[i], primerCuadrante[i].length, segundoCuadrante[i].length);

                        } else if(i>=primerCuadrante.length&&i<primerCuadrante.length*2){
                            System.arraycopy(tercerCuadrante[contador], 0, traspuesta[i], 0, tercerCuadrante[contador].length);
                            System.arraycopy(cuartoCuadrante[contador], 0, traspuesta[i], tercerCuadrante[contador].length, cuartoCuadrante[contador].length);
                            contador++;
                        }


                }
                       return traspuesta;
            }
        }
        return null;
    }


            static  ArrayList<int[][]> splitM ( int[][] m,int n){
                int baris = n/2;
                int kolom = n/2;
                int lebarZona = 2;
                int tinggiZona = 2;

                ArrayList<int[][]> daftarZona = new ArrayList<int[][]>();

                int counterBaris = 0;
                int counterKolom = 0;

                for (int i = 0; i < tinggiZona; i++) {
                    for (int j = 0; j < lebarZona; j++) {
                        int copyArray[][] = new int[baris][kolom];

                        for (int k = 0; k < baris; k++) {
                           System.arraycopy(m[counterBaris], counterKolom, copyArray[k], 0, kolom);
                            counterBaris++;
                        }

                        daftarZona.add(copyArray);
                    }
                    counterBaris = 0;
                    counterKolom += kolom;
                }


                return daftarZona;

          }

            public static void main (String[]args){
                int m[][] = new int[][]{{4, 5, 6, 9,7,4,2,5},
                                        {5, 8, 9, 4,6,3,2,6},
                                        {8, 9, 9, 6,2,6,7,8},
                                        {7, 7, 9, 8,6,4,2,6},
                        {4, 5, 6, 9,7,4,2,5},
                        {8, 9, 9, 6,2,6,7,8},
                        {7, 7, 9, 8,6,4,2,6},
                        {7, 7, 9, 8,6,4,2,6}};


           int[][] trasp=getTraspuesta(m,m.length);
                for(int i = 0; i < trasp.length; i++)
                {
                    String output="";
                    for(int j = 0; j < trasp[i].length; j++)
                    {
                        output += trasp[i][j] + " ";
                    }
                    System.out.println(output);
                    output = "";
                }
     }
      }