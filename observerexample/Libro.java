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
* Esta es la clase SubjectConcrete que es el objeto al cual hacen referencia los observadores.
* Esta clase posee dos estados String, un titulo y el estado del libro. Cualquier cambio en un objeto 
* libro sera notificado a sus observadores.
*/
public class Libro {
    //Estado de un libro
    private String titulo;
    private String estado;
    
    //Metodos setters y getters para obtener y modificar el estado de un libro.
    public String getTitulo(){ 
        return titulo;
    }
    
    public void setTitulo(String titulos){
        this.titulo = titulo;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
}
