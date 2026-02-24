package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class Arrays {
    public static void main(String[] args){

            int [] miArreglo=new int [7]; 
            int[] miArrreglo2= {1,5,7,9,4,5,100}; 

        for(int i=0; i<miArreglo.length; i++){
            miArreglo[i]= i;
            System.out.print("\t"+miArreglo[i]+"");
        }
            System.out.println("\n");
        for(int a=0; a<miArrreglo2.length; a++){
            System.out.print("\t"+miArrreglo2[a]+"");
        }

            System.out.println("\n\n");

            int miMatriz[][]= new int[5][2]; 
            int miMatriz2 [][] = {{2,5,3},{3,6,9},{0,8,9}}; 

        for(int i=0; i<miMatriz2.length; i++){
            for(int j=0; j<miMatriz2[i].length; j++){
                System.out.print("\t"+miMatriz2[i][j]+"");
            }
            System.out.println();
        }

            System.out.println("\n");
            for (int i=0; i<miMatriz.length; i++){
                for(int j=0; j<miMatriz[i].length; j++){
                    miMatriz[i][j]=i*j;
                    System.out.print("\t"+miMatriz[i][j]+"");
                }
                System.out.println();
            }


    }
    
}
