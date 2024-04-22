# Adapter, Decorator y Builder

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
- Adapter:
    - Propósito: permite la colaboración entre objetos con interfaces no polimórfiscas entre sí.
    - Ejemplo: Dibujar figuras en un canvas.
