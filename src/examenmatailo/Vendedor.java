/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmatailo;

/**
 *
 * @author labctr
 */
public class Vendedor {
    String Nombre;
    String Apellido;
    float Venta;

    public Vendedor(String Nombre, String Apellido, float Venta) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Venta = Venta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public float getVenta() {
        return Venta;
    }

    
    
}
