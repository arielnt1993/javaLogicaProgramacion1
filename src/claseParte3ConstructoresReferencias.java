class Personas{
    int dni;
    String nombre;

    Personas(int dni,String nombre){
        //usar this. le dice al compilador que las variables de la izq son las que se instancian
        // y las de la derecha las variables locales
        this.dni = dni;
        this.nombre = nombre;
    }
    /* calificadores de acceso:
    * si es publico, lov e cualquiera, protected lo ve esa clase y
    * pauqte de clases y derivados, private Solo la clase y "friendly"
    * o "default" es cuando que no pones tipo de acceso y puede ser
    * accedido por todas las clases dentro de la carpeta*/
}

public class claseParte3ConstructoresReferencias{
    public static void main(String[] args) {
        Personas pri = new Personas(37666560,"Ariel");
        Personas seg = new Personas(27985245,"Camila");
        System.out.println("el nombre del primero es: "+pri.nombre);
        System.out.println("el dni del segundo es: "+seg.dni);
    }
}
