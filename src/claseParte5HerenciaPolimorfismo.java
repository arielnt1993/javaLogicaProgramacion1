class Humanos {
    protected String nombre;
    /*como nombre esta protected tenemos que mandar get y set para
    * modificar el value de nombre cuando lo llamemos desde una clase que herede
    * a esta sin tener que definir la funcion en dicha clase*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*nos permite mostrar por pantalla el objeto sin definir que key notese
    que aca nos va a mostrar en pantalla humanos{} por mas que hallamos utilizado
    new empleados, en ese caso usar el toString en empleados
    * queremos mostrar*/
   /* @Override
    public String toString() {
        return "Humanos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }*/
}

class Empleados extends Humanos {
    //podemos poner un metodo para modificar directamente un key
    void pp() {
        nombre = "Juan";
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

public class claseParte5HerenciaPolimorfismo {
    public static void main(String[] args) {
        Empleados p = new Empleados();
        p.pp();
        System.out.println(p.nombre);
        p.setNombre("ariel");
        System.out.println(p.nombre);
        System.out.println(p);
    }
}
