package com.mycompany.inventariosinhilos;

import javax.swing.JOptionPane;

public class PrincipalSinHilos {

  
    public static void main(String[] args) {
       long inicio = System.currentTimeMillis();      
        MetodosSinHilos m = new MetodosSinHilos();
        m.VectorA();
        m.VectorB();
        m.VectorC();
        m.PedidoMayor(); 
        long fin = System.currentTimeMillis();
        long total = fin - inicio;      
        System.out.println("Tiempo de ejecución sin hilos: "+ total +" milisegundos");
    }
        
        
       
}
    

