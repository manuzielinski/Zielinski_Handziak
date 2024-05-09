package singleton_model;

public class Conexion {

    //Declaración
    private static Conexion instancia;
    //private static Conexion instancia = new Conexion();

    //Para evitar instancia mediante operador "new"
    private Conexion() {

    }

    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstancia() {
        if(instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    //Método de prueba
    public void conectar() {
        System.out.println("Conectar a la base de datos");
    }

    //Método de prueba
    public void desconectar() {
        System.out.println("Desconectar de la base de datos");
    }

}
