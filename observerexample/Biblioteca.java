/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
* Esta clase dispara el evento de que un libro fue entregado en mal estado y por lo tanto
* se notifican a los observadores del objeto libro para que realicen sus respectivas modificaciones.
*/
public class Biblioteca {
     
    public void devuelveLibro(Libro libro){
         if(libro.getEstado().equals("MALO")){ //Cuando el estado de un libro entregado sea "MALO", se activa la alarma.
             AlarmaLibro a = new AlarmaLibro(); //Se crea la alarma 
             a.notifyObservers();  //Los observadores son notificados de lo ocurrido.
         }
    }
}
