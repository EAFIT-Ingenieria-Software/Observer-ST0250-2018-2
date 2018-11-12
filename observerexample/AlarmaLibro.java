/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import observerexample.interfaces.Subject;
import observerexample.interfaces.ILibroMalEstado;
import java.util.ArrayList;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
* Esta clase es el subject con los metodos implementados que tiene la interfaz Subject.
* Desde aquí se controla que observadores se agregan, cuales se eliminan y se notifican a los observadores
* de algún cambio en un objeto libro.
*/
public class AlarmaLibro implements Subject {
    //Se crea una lista de tipo ILibroMalEstado para almacenar los observadores que hacen referencia a un libro.
    private static ArrayList<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();
    
    public void attach(ILibroMalEstado observador){ //Este metodo agrega un observador a la lista
        observadores.add(observador);
    }
    
    public void dettach(ILibroMalEstado observador){ //Este metodo elimina un observador de la lista
        observadores.remove(observador);
    }
    
    //Con este metodo se notifica a todos los observadores de la lista acerca de un cambio.
    public void notifyObservers(){
        for(int i = 0; i < observadores.size(); i++){
            observadores.get(i).update();
        }
    }
    
}
