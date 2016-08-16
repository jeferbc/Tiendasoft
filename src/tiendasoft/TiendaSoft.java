/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendasoft;

import java.util.Scanner;

/**
 *
 * @author Aldebarantech
 */
public class TiendaSoft {

    /**
     * @param args the command line arguments
     */
    static Scanner lector=new Scanner(System.in);
    static int option,busqueda=0,numitem=0,amount,ventas;
    static String Producto;
    static double Precio,ganancia;
    static product arrayObjetos[]=new product[10];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
                    do{
                    System.out.println("\nDigite Una Opcion ");
                    System.out.println("1. Agregar Producto");
                    System.out.println("2. Buscar Producto");
                    System.out.println("3. Elimminar Producto");
                    System.out.println("4. Mostrar Inventario");
                    System.out.println("5. Realizar Venta");
                    System.out.println("6. Mostrar Ganancias totales");
                    System.out.println("7. Salir\n");
                    option=lector.nextInt();
        
                    switch (option){
                        case 1: System.out.println("\nDigite Producto");
                                Producto=lector.next();
                                System.out.println("Digite Cantidad");
                                amount=lector.nextInt();
                                System.out.println("Digite Precio");
                                Precio=lector.nextDouble();
                                //System.out.println("\nDigite un nuevo usuario ");
                                arrayObjetos[numitem]= new product(Producto,amount,Precio,numitem);
                                numitem++;
                                break;
                                
                        case 2:
                            if(search()==true){
                                arrayObjetos[busqueda].print();
                                break;
                            }else{
                                System.out.println("\nNo existe el Producto");
                                break;
                            }
                        case 3: if(search()==true){
                                //arrayObjetos[busqueda].dispose();
                                arrayObjetos[busqueda]=arrayObjetos[numitem-1];
                                numitem--;
                                System.out.println("\nProducto Borrado Exitosamente");
                                System.out.println("\n"+arrayObjetos[busqueda].getItem());
                                break;
                            }else{
                                System.out.println("\nNo existe el Producto");
                                break;
                            }
                        case 4: for(int i=0;i<numitem;i++)
                                    arrayObjetos[i].print();
                                break;
                        
                        case 5: if(search()==true){
                                    System.out.println("\nDigite cantidad a vender");
                                    amount=arrayObjetos[busqueda].getAmount();
                                    ventas=lector.nextInt();
                                    if(amount>=ventas){
                                        arrayObjetos[busqueda].setVentas(arrayObjetos[busqueda].getVentas()+ventas);
                                        arrayObjetos[busqueda].setAmount(arrayObjetos[busqueda].getAmount()- ventas);
                                        break;
                                    }else{
                                        System.out.println("\nNo hay suficiente "+arrayObjetos[busqueda].getItem()+" en Inventario");
                                        break;
                                    }
                                }else{
                                    System.out.println("\nNo existe el Producto");
                                    break;
                                }
                        case 6: ganancia=0; 
                            for(int i=0;i<numitem;i++){
                                arrayObjetos[i].printgan();
                                System.out.println("\nLa ganancia el producto "+arrayObjetos[i].getItem()+" es: "+arrayObjetos[i].ganancia());
                                ganancia+=arrayObjetos[i].ganancia();
                            }
                            System.out.println("\nLa ganancia total es: "+ganancia);

                            break;
                    }
                                    
                                
                                
                    }while(option!=7);
             
        }
    
    public static boolean search(){
        System.out.println("\nDigite Producto ");
        Producto=lector.next();
        for(int i=0;i<numitem;i++){
            if(Producto.equals(arrayObjetos[i].getItem())){
                busqueda=i;
                return true;
            }
        }
        return false;
        
    }
       
        
    }
    

