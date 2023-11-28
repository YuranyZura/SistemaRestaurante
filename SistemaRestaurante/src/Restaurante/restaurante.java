
package Restaurante;

import java.io.File;

/**
 * @author Yurany Zura
 */

public class restaurante {
    
  public static File inventario;

    class Nodo {
        int codigo;
        String nombre;
        int precio;
        Nodo link;
    }

    Nodo agregarinventario(Nodo ptr, int cod, String nom, int precio) {
        Nodo p = new Nodo();
        p.codigo = cod;
        p.nombre = nom;
        p.precio = precio;
        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    public static void main(String[] args) {
    }
}

/**
 * @param args the command line arguments
 */
