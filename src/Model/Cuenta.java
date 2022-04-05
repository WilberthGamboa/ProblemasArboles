package Model;

public class Cuenta {
    int  numeroCuenta;
    String nombreCuenta;
    double saldoCuenta;
    public Cuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.saldoCuenta= Math.random()*100;
    }
    public String getNombreCuenta() {
        return nombreCuenta;
    }
    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    @Override
    public String toString() {
        return "Cuenta [nombreCuenta=" + nombreCuenta + ", numeroCuenta=" + numeroCuenta + ", saldoCuenta="
                + saldoCuenta + "]";
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    
    
    
}
