
package examenmatailo;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenMatailo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        System.out.println("Ingrese el numero de vendedores:");
        int numVendedores=LecturaDatos.LeerEntero();
        float total=0;
        for (int i = 0; i < numVendedores; i++) {
          System.out.println("Ingrese el nombre");  
          String Nombre=sc.nextLine();
          System.out.println("Ingrese el apellido");  
          String Apellido=sc.nextLine();
          System.out.println("Ingrese la cantidad vendida");  
          Float Venta=LecturaDatos.LeerFloat();
          total+=Venta;
          Vendedor vendedor=new Vendedor(Nombre,Apellido,Venta);
          vendedores.add(vendedor);
        }
        System.out.println("Nombre\t\tApellido\t\tVenta");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getNombre()+"\t\t"+vendedor.getApellido()+"\t\t"+vendedor.getVenta()+"\t");
        }
        System.out.println("===============================================================================");
        System.out.println("\t\tTotal: "+total);
        System.out.println("\t\tPromedio: "+total/numVendedores);
         }
}
