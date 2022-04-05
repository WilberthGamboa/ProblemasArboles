package Utils;
import java.util.LinkedList;
import java.util.Scanner;

import ABB.Node;
import ABB.Tree;
import Model.ClienteBanco;
import Model.Cuenta;

public class AdministradorClienteBanco {
    Tree<ClienteBanco> arbolDeUsuarios = new Tree<ClienteBanco>();
    LinkedList<ClienteBanco> usuariosAntiguos= new LinkedList<ClienteBanco>();
    int contador = 0;

    public void crearCliente() {
        //VARIABLES PARA ALMACENAR DATOS
        LinkedList<Cuenta> cuenta = new LinkedList<Cuenta>();
        String numeroCliente = String.valueOf(contador++);
        String nombre;
        String telefono;
        int antiguedad;
        int contador=0;
        //ESCANER 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese Telefono");
        telefono = sc.nextLine();
        
        //
        int condition;
        System.out.println("Ingrese el nombre de su cuenta");
        Cuenta c = new Cuenta( sc.nextLine());
        c.setNumeroCuenta(contador++);
        cuenta.add(c);

        do {
        Scanner sz = new Scanner(System.in);
            System.out.println("1-Ingresar otra cuenta 2-Salir");
            condition=sc.nextInt();
            if (condition==1) {
                System.out.println("Ingrese el nombre de su cuenta");
                Cuenta d = new Cuenta( sz.nextLine());
                d.setNumeroCuenta(contador++);
                cuenta.add(d);
               
                
            }

            
        } while (condition!=2);
        
        System.out.println("Ingrese antiguedad");
        antiguedad = sc.nextInt();
        ClienteBanco e = new ClienteBanco(numeroCliente, nombre, telefono, cuenta, antiguedad);

        // Se puede implementar una arbol de antiguedad
        arbolDeUsuarios.insert(e);
        if(antiguedad>5){
            
        }
        
    }
    public void actualizarDatosPersonales() {
        String numeroCliente;
        String nombre;
        String telefono;
        Scanner sc = new Scanner(System.in);
        System.out.println("numero cliente a actualizar");
        numeroCliente = sc.nextLine();
        System.out.println("Ingrese nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese Telefono");
        telefono = sc.nextLine();

        //prueba xd
        ClienteBanco e = new ClienteBanco(numeroCliente);

        Node<ClienteBanco> eaux = new Node<ClienteBanco>();
        eaux = arbolDeUsuarios.find(e);
        e = eaux.getData();
        e.setNombre(nombre);
        e.setTelefono(telefono);
     
        
        arbolDeUsuarios.replace(e);
       


    }

    public void actualizarSaldo(){
        String numeroCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("numero cliente a actualizar");
        numeroCliente = sc.nextLine();
        ClienteBanco e = new ClienteBanco(numeroCliente);

        Node<ClienteBanco> eaux = new Node<ClienteBanco>();
        eaux = arbolDeUsuarios.find(e);
        e = eaux.getData();
        System.out.println("numero cliente a actualizar");
        numeroCliente = sc.nextLine();

        for (int i = 0; (i < e.getListaDeCuentas().size()) ; i++) {

            if (numeroCliente.equals(String.valueOf(e.getListaDeCuentas().get(i).getNumeroCuenta()))) {
                System.out.println("Insertar Saldo nuevo");
                saldo= sc.nextDouble();
                e.getListaDeCuentas().get(Integer.valueOf(numeroCliente)).setSaldoCuenta(saldo);
                arbolDeUsuarios.replace(e);


            }
            
        }
        
     
     
    }
    public void buscarCliente(String numeroCliente) {
        ClienteBanco e = new ClienteBanco(numeroCliente);

        Node<ClienteBanco> eaux = new Node<ClienteBanco>();
        eaux = arbolDeUsuarios.find(e);
        e = eaux.getData();

        System.out.println(e);
        // System.out.println(aux.getNombre());
        
    }

    public void borrarCliente() {
        String numeroCliente;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("numero cliente a borrar");
        numeroCliente= sc.nextLine();
        ClienteBanco e = new ClienteBanco(numeroCliente);
        arbolDeUsuarios.deleteKey(e);

    }

    public void mostrarUsuarios(){
       // arbolDeUsuarios.traverse(1);
        arbolDeUsuarios.traverse(2);
       // arbolDeUsuarios.traverse(3);
    }

   

    public void imprimirUsuariosAntiguedad() {

        LinkedList<ClienteBanco> e = new LinkedList<ClienteBanco>(arbolDeUsuarios.getLista());
        
        for (int i = 0; i < e.size(); i++) {
           
            if (e.get(i).getAntiguedad()>5) {
                System.out.println(e);
                
            }
            
        }
     
       

    }

   

}
