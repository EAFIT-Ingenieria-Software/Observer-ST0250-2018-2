/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample.interfaces;

/**
 * @author Jhon Rodriguez
 * @author Alejandro Roman
 * @author Santiago Castrillon
 */

/*
* Cada clase que quiera observar el cambio del estado de un libro deberá  implementar
* esta interfaz la cual posee un metodo update() que dichas clases observadoras deben darle
* logica una vez sean notificadas del cambio.
*/
public interface ILibroMalEstado {
    public void update();
}
