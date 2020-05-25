class Personas{
    int dni;
    String nombre;

    Personas(int DNI,String NOMBRE){
        //no usar mayusculas de esta forma
        dni = DNI;
        nombre = NOMBRE;
    }
}

public class claseParte3ConstructoresReferencias{
    public static void main(String[] args) {
        Personas pri = new Personas(37666560,"Ariel");
        Personas seg = new Personas(27985245,"Camila");
        System.out.println("el nombre del primero es: "+pri.nombre);
        System.out.println("el dni del segundo es: "+seg.dni);
    }
}
