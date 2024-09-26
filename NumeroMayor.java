public class NumeroMayor {
    public static void main(String[] args) {
        
        int[] numeros ={1,2,3,4,5,6,7,8,9,10};

        int mayor = numeros[0];

        for (int i=1;i<numeros.length; i++)
        {if (numeros[i]> mayor) {mayor=numeros[i];}}

        System.out.println("numero mayor = "+ mayor);

        
    }
}
