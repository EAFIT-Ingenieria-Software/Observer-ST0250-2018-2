/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import observers.Stock;
import observers.Compras;
import observers.Administracion;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
* Este es un ejemplo un ejemplo de una Biblioteca, donde cada vez que un lector devuelve un libro se ejecuta un metodo 
* en la clase Biblioteca y si el lector devolvió el libro dañado entonces la aplicación 
*avisa a ciertas clases que están interesadas en conocer este evento
*/
public class ObserveExample {

    /**
     * Desde aquí se controla todo el proceso que ocurre en el patrón Observer.
     */
    public static void main(String[] args) {
       AlarmaLibro a = new AlarmaLibro();
       a.attach(new Compras());
       a.attach(new Administracion());
       a.attach(new Stock());
       
       Libro libro = new Libro();
       libro.setEstado("MALO");
       
       Biblioteca b = new Biblioteca();
       b.devuelveLibro(libro);
    }
    
}
