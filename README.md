# Patrón de Diseño Observer
Santiago Castrillon Galvis <br/>
Jhon Edinson Rodriguez <br/>
Jose Alejandro Roman <br/>


## 1. Explicación de la problemática
Se tiene una biblioteca donde constantemente se prestan libros, estos poseen un estado que puede ser bueno o malo, cuando son prestados se encuentran en buen estado, sin embargo se puede dar el caso de que un usuario devuelva un libro en mal estado, por lo que se vuelve necesario avisar a las diferentes dependencias de la biblioteca que se encargan de resolver esta situación(stock,administración, compras).
Es por esto que se recurre al patrón de diseño Observer, puesto que el sistema de la biblioteca debe reaccionar al cambio de estado de los libros para que cuando se reciba un libro(sujeto observado) y este malo(cambio de estado)se avise(notificación-alerta) a cada una de las dependencias(observadores). Notese que son varias las dependencias que reaccionan al cambio de estado de una misma clase, por lo que se vuelve conveniente aplicar este patrón.



## 2. Modelo de clases

![diagrama de clases](https://user-images.githubusercontent.com/33042735/48373078-b159d880-e68e-11e8-98f0-16bb43f80a77.jpeg)

## 3. Lenguaje de Programación
Java

## 4. Descripción del código
La interfaz Subject posee los metodos para poder hacer el manejo de los observadores que tenga un objeto, estos metodos son los de agregar o eliminar observadores y notificarles alguna novedad. La clase AlarmaLibro implementa los metodos de Subject por lo cual depende de esta interfaz, además posee una lista donde almacena los observadores de un objeto. La clase Libro se tiene que esta es 
la que genera los sujetos concretos de una aplicación, es decir, los objetos que van a ser observados. Los libros cuentan con un titulo y el estado en que están. La interfaz ILibroMalEstado es la que posee el metodo actualizar que deben implementar todos los observadores de un libro. Las clases Stock, Compras y Administración son los observadores concretos y se encargan de implementar cada uno el metodo actualizar de la interfaz ILibroMalEstado donde estan agregadas. La clase Biblioteca es como la encargada de disparar el evento de todo el sistema, esto es que cuando un estudiante entregue el libro en mal estado es esta la activa la alarma de la situación. Por último tenemos ObserveExample que es la clase main del ejemplo.
## 5. Referencias Bibliográficas
http://migranitodejava.blogspot.com/search/label/Observer




