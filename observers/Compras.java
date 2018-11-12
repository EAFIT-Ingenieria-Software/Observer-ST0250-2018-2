/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import observerexample.interfaces.ILibroMalEstado;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
*Esta clase es un ObserverConcreto que esta haciendo referencia a un objeto libro
* que le resulta de interes y reacciona ante algún cambio de ese objeto. Además implementa
* la interfaz update dada por el Observer.
*/
public class Compras implements ILibroMalEstado {
     
    /*
    *Se implementa el metodo update() de la interfaz ILibroMalEstado cuando se notifica a la administración
    * de que un cliente entregó el libro en mal estado. Compras  solicita la compra de un nuevo libro
    * cuando ocurra esto.
    */
    public void update(){
        System.out.println("Compras: ");
        System.out.println("Solicito nueva cotizacion..");
    }
}
