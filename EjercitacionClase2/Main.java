public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = Cuenta.crearCuentaDesdeConsola();

        cuenta.ingresar(1000);
        cuenta.consultarDatos();

        cuenta.retirar(500);
        cuenta.consultarDatos();

        cuenta.extraccionRapida();
        cuenta.consultarDatos();
    }
    
}