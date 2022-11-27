
package com.mycompany.inventariosinhilos;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class MetodosSinHilos {
    
     private static final int TAMANIO = 1000;
    
    SecureRandom sr = new SecureRandom();
    
    //Creacion de vectores
    
    //Inventario    
    int[] A = new int[TAMANIO];
    // pedidos
    int[] B = new int[TAMANIO];    
    //stock
    int[] C = new int[TAMANIO];
    
    public void VectorA() {
        for (int i = 0; i < TAMANIO; i++) {
            A[i] = sr.nextInt();
            System.out.println("Llenado A: " + i);
        }
    }
    
    public void VectorB() {
        for (int i = 0; i < TAMANIO; i++) {
            B[i] = sr.nextInt();
            System.out.println("Llenado B: " + i);
        }
    }
    
    public void VectorC() {
        for(int i = 0; i < TAMANIO; i++) {
            int val = 0;
            if (A[i] == B[i]) {
                val = A[i];
            } else if (B[i] > A[i]) {
                val = 2 * (B[i] - A[i]);
            } else {
                val = B[i];
            }
            C[i] = val;
            System.out.println("llenar C: " + i);
        }
    }
   
    public void PedidoMayor() {
        int mayor = 0;
        for ( int b : B) {
            if (b > mayor) {
                mayor = b;
            }
        }      
        System.out.println("El pedido mayor es: " + mayor);
    }
     
     
       
      
    
}
