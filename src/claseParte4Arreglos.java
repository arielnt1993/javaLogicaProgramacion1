public class claseParte4Arreglos {
    public static void main(String[] args) {
        /*en java los arreglos se arman de
        * esta forma, ya que son objetos.
        * los arreglos son mutables en contenido*/
        int[] a;
        a = new int[4];
        /*asignar los valores asi no es lo mejor
        * preferible usar un ciclo*/
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        a[3] = 9;
        for (int j = 0;j <a.length;j++){
            System.out.println(a[j]);
        }
    }
}
