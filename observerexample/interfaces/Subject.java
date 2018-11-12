/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample.interfaces;

import observerexample.interfaces.ILibroMalEstado;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */


/*
* Esta es una interfaz que conoce a sus observadores y ofrece la posibilidad de añadir y eliminar 
* observadores. Posee un método llamado attach() y otro detach() que sirven para agregar o remover 
* observadores en tiempo de ejecución.
*/
public interface Subject {
    public void attach(ILibroMalEstado observador); //Metodo para añadir un observador al objeto
    public void dettach(ILibroMalEstado observador); //Metodo para eliminar un observador del objeto
    public void notifyObservers(); //Metodo que notificará a los observadores sobre un cambio.
}
