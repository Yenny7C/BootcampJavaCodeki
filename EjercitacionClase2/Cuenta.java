import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    // Constructor por defecto
    public Cuenta() {
        
    }

    // Constructor con parámetros
    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dnicliente) {
        this.dniCliente = dniCliente;
    }
    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
   
    // Método para crear un objeto Cuenta pidiendo datos al usuario
    public static Cuenta crearCuentaDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
    
        // Consumir el carácter de nueva línea
        scanner.nextLine();
    
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
    
        System.out.println("Ingrese el saldo actual:");
        double saldoActual = scanner.nextDouble();
    
        return new Cuenta(numeroCuenta, dniCliente, saldoActual);
    }
    //Métodos 
    public void ingresar(double ingreso) {
        this.saldoActual += ingreso;
    }
    
    public void retirar(double retiro) {
        if (retiro <= this.saldoActual) {
            this.saldoActual -= retiro;
        } else {
            this.saldoActual = 0;
        }
    }
    
    public void extraccionRapida() {
        double porcentajeExtraccion = 0.2 * this.saldoActual;
        this.saldoActual -= porcentajeExtraccion;
    }
    
    public double consultarSaldo() {
        return this.saldoActual;
    }
    
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
    }
    
}     
 