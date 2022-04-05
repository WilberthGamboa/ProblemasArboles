package Model;

import java.util.LinkedList;

public class ClienteBanco implements Comparable<ClienteBanco> {

    String numeroCliente;
    String nombre;
    String telefono;
    LinkedList<Cuenta> listaDeCuentas;
    int antiguedad;

    public ClienteBanco(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public ClienteBanco(String numeroCliente, String nombre, String telefono) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ClienteBanco(LinkedList<Cuenta> listaDeCuentas, int antiguedad) {
        this.listaDeCuentas = listaDeCuentas;
        this.antiguedad = antiguedad;
    }

    public ClienteBanco(String numeroCliente, String nombre, String telefono, LinkedList<Cuenta> listaDeCuentas,
            int antiguedad) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaDeCuentas = listaDeCuentas;
        this.antiguedad = antiguedad;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LinkedList<Cuenta> getListaDeCuentas() {
        return listaDeCuentas;
    }

    public void setListaDeCuentas(LinkedList<Cuenta> listaDeCuentas) {
        this.listaDeCuentas = listaDeCuentas;
    }

    @Override
    public int compareTo(ClienteBanco o) {
        int variable = 0;
        if (this.numeroCliente.compareTo(o.getNumeroCliente()) > 0) {
            variable = 1;
        }
        if (this.numeroCliente.compareTo(o.getNumeroCliente()) < 0) {
            variable = -1;
        }
        // TODO Auto-generated method stub
        return variable;
    }

    @Override
    public String toString() {
        return "ClienteBanco [numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", telefono=" + telefono
                + ", listaDeCuentas=" + listaDeCuentas + "antiguedad=" + antiguedad + "]";
    }

    /*
     * @Override
     * public String toString() {
     * String xd = "numeroCliente=" + numeroCliente
     * +", nombre="+nombre+", telefono=" + telefono +", listaDeCuentas=" +
     * listaDeCuentas +"antiguedad=" + antiguedad+
     * return "ClienteBanco [antiguedad=" + antiguedad + ", listaDeCuentas=" +
     * listaDeCuentas + ", nombre=" + nombre
     * + ", numeroCliente=" + numeroCliente + ", telefono=" + telefono + "]";
     * }
     * 
     */

}
