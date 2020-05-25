import java.util.Scanner;
public class claseParte1ConceptosBasicos {
    public static void main(String[] args) {
        // entrada por teclado
        Scanner input = new Scanner(System.in);
        //las variables hay que declarar tipo
        //int x= 1;
        //sin embargo se puede operar entre enteros y flotantes
        int a = 7;
        double b = 2.0;
        double c = a/b;
        System.out.print("escriba el valor de y: ");
        int y = input.nextInt();
        /* va a dar como resultado un valor con coma
        pero si b es un int solo queda el entero*/
        System.out.println("el valor de c es:"+c);
        System.out.println("el valor de y es: "+y);
    }
}
