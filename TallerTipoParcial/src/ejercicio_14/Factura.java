/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;



public class Factura {
    
        private String idFactura;
        private Producto producto;

    public Factura(String idFactura, Producto producto) {
        this.idFactura = idFactura;
        this.producto = producto;
    }

    public Factura() {
    }

    @Override
    public String toString() {
        return "Informacion del Producto" + "\n" +
                "Factura Nro: " + idFactura + "\n" +
                "Producto: " + producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }
    
    public void consultarFactura(String idfactura){
        if(idfactura.equals(idFactura)){
            producto.toString();
     
        }
        
        
    }
    
}
