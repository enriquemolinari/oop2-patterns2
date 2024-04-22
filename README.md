# Decorator, Builder y Adapter

- Decorator:
    - Propósito: permite agregar funcionalidad a un objeto de forma dinámica.
    - ¿Qué queremos decir con "en forma dinámica"? No necesito crear una clase que herede de otras para agregar nuevo
      comportamiento, si no que lo hago combinando instancias de clases existentes.
    - Pero si ya existe un objeto no decorado, y quiero que las referencias a él pasen a verlo como uno decorado,
      esto no es posible en java al menos. En Smalltalk tenemos el `become`.
      ```
      var auto = new Auto();
      var poweredAuto = new Powered(new Auto());
      auto.become(poweredAuto); // a partir de aca auto pasaría a ser la version decorada (poweredAuto).
      ```
    - Ejemplos: Noticias y Envio de email en inscripción de un Concurso
    - Los decoradores no deben heredar de una clase concreta. En el ejemplo de Noticia se puede ver que si lo hago
      los constructores me develan que estoy teniendo variables de instancia en los decoradores que no tengo que tener (
      duplicando información).
    - Si no tuviera constructores podría no darme cuenta y setear la variable de instancia que queda en el decorador y
      no en Noticia que es la que realmente deberia quedar.
    - El orden en que creamos las instancias importa y puede afectar.
    - Podemos usar un **Builder**. Propósito: Abstrae el proceso de creación de un objeto complejo, centralizando dicho
      proceso en un único punto, de tal forma que el mismo proceso de construcción pueda crear representaciones
      diferentes.
- Adapter:
    - Propósito: permite la colaboración entre objetos con interfaces no polimórfiscas entre sí.
    - Ejemplo: Dibujar figuras en un canvas.