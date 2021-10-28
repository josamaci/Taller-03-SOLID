# Taller-03-SOLID
- Jose Macias - Nicolas Plaza - Kevin Valle - Fausto Jacome
1. Principio que se rompe: LISKOV SUBSTITUTION PRINCIPLE
   
   Motivo: Las clases Helado y Pastel tienen los mismos atributos y metodos
   
   Solucion: Se creo una clase abstracta padre llamada Postre, para poder reutilizar el codigo y tener una mejor jerarquia.
   
2. Principios que se rompen: SINGLE RESPONSABILITY PRINCIPLE, OPEN-CLOSED PRINCIPLE
   
   Motivos: La clase OperacionesAderezo tienen metodos que se repiten. Ademas, los metodos de OperacionesAderezo eran dependientes de las clases Helado y Pastel.
   
   Solucion: Se elimino OperacionesAderezo y en la clase padre Postre se agregaron los metodos de anadir y quitar aderezo. De esa manera, el programa no tendra duplicacion de  codigo y estara mejor encapsulado.
