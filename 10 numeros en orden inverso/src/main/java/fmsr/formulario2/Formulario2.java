package fmsr.formulario2;
import java.util.Scanner;
public class Formulario2 {
    public static void main(String[] args) 
    {
        Scanner leer= new Scanner(System.in);
        int[]arreglo= new int[10];
        for(int cont=0; cont<=9; cont++)
        {
            System.out.print("Ingrese un numero: ");
            arreglo[cont]=leer.nextInt();
        }
        for(int cont=9; cont<=0; cont--)
        {
            System.out.print("Los valores en orden inverso son: "+arreglo[cont]);
        }
    }
}
