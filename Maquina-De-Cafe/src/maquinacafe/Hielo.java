/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;



public class Hielo extends Decorardor{
    
    private Adiciones adicion;

    public Hielo(Adiciones adicion) {
        super(adicion);
        this.adicion = adicion;
    }

    @Override
    public String getdescripcion() {
        return adicion.getdescripcion()+ "SE AGREGO HIELO";
    }

    @Override
    public int getprecio() {
       return adicion.getprecio() + 0;
    }
    
}