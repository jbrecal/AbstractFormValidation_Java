# Formulario HTML en Java con validaciones extendiendo con métodos de clases abstractas
## Java
<p>Este formulario HTML contiene diferentes tipos de campos con validaciones específicas mediante clases abstractas y sus clases derivadas. Gracias a esta estructura, es fácil agregar nuevos tipos de validadores o elementos de formulario según sea necesario.</p>

**Estructura del Proyecto**
<p>El proyecto está dividido en dos principales paquetes: validadores y elementos.</p>

**Paquete validadores**
<p>Este paquete contiene clases que definen las reglas de validación de los campos del formulario.</p>

**Clase Abstracta Validador:** Clase base abstracta que define los métodos de validación que se extienden en validadores específicos. Permite centralizar la lógica de validación y extenderla según las necesidades de cada campo.

**Validadores Específicos:** Cada uno extiende de Validador y aplica una regla de validación específica:

- EmailValidador: Valida que el contenido de un campo sea un correo electrónico válido.
- LargoValidador: Controla la longitud mínima y máxima permitida para un campo.
- NoNuloValidador: Asegura que el campo no sea nulo o vacío.
  
**Paquete elementos**
<p>Este paquete contiene las clases que representan los elementos del formulario.</p>

**Clase Abstracta ElementoForm:** Clase base para los elementos del formulario. Contiene las propiedades comunes nombre y valor, que representan el nombre y el valor de cada campo del formulario.

**Elementos de Formulario:**

- InputForm: Representa un campo de entrada de texto.
- SelectForm: Representa un campo de selección.
- TextAreaForm: Representa un área de texto multilínea.
