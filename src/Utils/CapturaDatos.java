package Utils;
import java.util.Scanner;

public class CapturaDatos {
    private AdministradorClienteBanco administradorClienteBanco;

    public CapturaDatos(){
        this.administradorClienteBanco= new AdministradorClienteBanco();
    }


    public void opciones(){
        Scanner sc = new Scanner(System.in);
       
        int option;
        
        do {

            System.out.println("1-INGRESAR CLIENTE 2-ELIMINAR CLIENTE 3-ACTUALIZAR DATOS PERSONALES,4-ACTUALIZAR SALDO,\n 5-DESPLEGAR CLIENTES ORDENADOS 6-DESPLEGAR CLIENTES MAYOR A 5 AÑOS");
            option= sc.nextInt();
            switch (option) {
                case 1:
                administradorClienteBanco.crearCliente();
                    break;
                case 2:
                administradorClienteBanco.borrarCliente();
                    break;
                case 3:
                administradorClienteBanco.actualizarDatosPersonales();
                    break;
                case 4:
                administradorClienteBanco.actualizarSaldo();
                    break;
                case 5:
                administradorClienteBanco.mostrarUsuarios();
                    break;
                case 6: 
                administradorClienteBanco.imprimirUsuariosAntiguedad();
                    break;
                default:
                System.out.println("Opcion incorrecta");
                    break;
            }
            
        } while (option!=0);
       
    }

    
}
