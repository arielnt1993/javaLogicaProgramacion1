class Humanos {

    /*como nombre esta protected tenemos que mandar get y set para
    * modificar el value de nombre cuando lo llamemos desde una clase que herede
    * a esta sin tener que definir la funcion en dicha clase*/
    protected String nombre;
    /*que pasa si definimos el constructor de Humanos? pos se clava el programa,
    * basta con crear un cosntructor con la clase hija*/
    public Humanos(String nombre){
        this.nombre = nombre;
    }
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
    /*se puede dejar el parametro vacio y reemplazar el parametro del super
    * por el valor indicado (por ej: reempplazar super(nombre) por super("nombre"))
    * si no hacemos lo anterior y lo dejamos como esta, entonces en new empleado()hay
    * que poner el parametro para poder crear el objeto de la forma adecuada*/
    public Empleados() {
        super("nombre");
    }

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
