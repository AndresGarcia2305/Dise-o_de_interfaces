# Herencia
## Preguntas Ejercicio Herencia
1. ¿Por qué es útil definir métodos con el mismo nombre en distintas clases?
   Para sobreescribirlo en todas las clases
3. ¿Qué ventaja aporta el uso de super frente a duplicar código?
   Permite meter en el constructor 
5. ¿Cómo mejora el polimorfismo la escalabilidad del programa?
   Mejora para diferenciar los tipos de empleados que hay
7. Si añadieras un nuevo tipo de empleado, ¿qué cambios deberías realizar en la
jerarquía?
Añadiría un empleado a media jornada para calcular el salario que debe de tener al realizar menos horas que un empleado de jornada completa

## Preguntas Ejercicio Animales
1. ¿Por qué no tiene sentido crear directamente un objeto de tipo Animal?
   Porque animal es una clase abstracta y poner un objeto de tipo Animal solo no tiene sentido ya que no sabemos qué tipo es.
3. ¿Qué ventajas aporta definir comportamientos comunes como interfaces?
   Permite compartir comportamientos en clases que no están relacionadas entre si
5. ¿Qué diferencia hay entre heredar de una clase abstracta e implementar una interfaz?
   Una interfaz comparte comportamientos entre diferentes clases mientras que la clase heredada comparte código y una estructura común
7. ¿Cómo facilita el polimorfismo la extensión del programa con nuevos tipos de animales?
   Permite tratar objetos de diferentes clases de manera uniforme
