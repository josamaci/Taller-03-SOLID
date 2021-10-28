# Taller-03-SOLID
- Jose Macias - Nicolas Plaza - Kevin Valle - Fausto Jacome
1. Principio que se rompe: LISKOV SUBSTITUTION PRINCIPLE
   
   Motivo: Las clases Helado y Pastel tienen los mismos atributos y metodos
   
   Solucion: Se creo una clase abstracta padre llamada Postre, para poder reutilizar el codigo y tener una mejor jerarquia.
   
2. Principios que se rompen: SINGLE RESPONSABILITY PRINCIPLE, OPEN-CLOSED PRINCIPLE
   
   Motivos: La clase OperacionesAderezo tienen metodos que se repiten. Ademas, los metodos de OperacionesAderezo eran dependientes de las clases Helado y Pastel.
   
   Solucion: Se elimino OperacionesAderezo y en la clase padre Postre se agregaron los metodos de anadir y quitar aderezo. De esa manera, el programa no tendra duplicacion de  codigo y estara mejor encapsulado.

3. Principios que se rompen : Single Responsibility Principle
   
   Motivos : los metodos calcularpreciofinal y showpreciofinal son independientes de las subclases de postre por lo cual pueden estar en otro proceso diferente
   
   Solucion : Agregar una nueva clase proceso que maneje unicamente el calculo del precio final para tener mayor facilidad al momento de editar el proceso.


4. Principios que se rompen: Dependency Inversion Principle 
   
   Motivos : La clase postre necesitaban un objeto concreto (Enum Aderezo) y necesitan depende una clase abstracta.
   
   Solucion: Crear una clase Aderezo y una subclase individual para cada aderezo existente.
