/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendasoft;

/**
 *
 * @author Aldebarantech
 */
public class product {
    private final String item;
    private int amount,codigo,ventas;
    private final double price;
    
    public void print (){
        System.out.println("\nProducto: "+this.item+"\nCantidad: "+this.amount+"\nPrecio: "+this.price+"\nCodigo: "+this.codigo);
        
    }
    public void printgan (){
        System.out.println("\nProducto: "+this.item+"\nVentas: "+this.ventas);
        
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public product(String item, int amount, double price,int codigo) {
        this.item = item;
        this.amount = amount;
        this.price = price;
        this.codigo = codigo;
    }
    public double ganancia(){
        return ventas*price;
    }
    
    
}
