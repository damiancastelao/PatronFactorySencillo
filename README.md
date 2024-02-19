# Patrón Factory

Uso de Factoria muy sencillo

Diagrama de clases:

```mermaid
classDiagram
      IComun <.. Consola : implements
      IComun <.. Ventana : implements
      class IComun{ +visualiza()}
      <<Interface>> IComun
      App "1" *-- "1..*" FactoriaDeSalidas : association
      class App{
          +main()
      }
      class FactoriaDeSalidas{
          +getProducto()
      }
      FactoriaDeSalidas "1" *-- "1..*" IComun : association
      class Consola {+visualiza()}
      class Ventana {+visualiza()} 
      
```

### Cambios

Añadele otra clase, por ejemplo `Impresora` y que imprima por consola el mensaje

Cambia la estructura de la Interfaz añadiendole el parámetro `msg` al método `visualiza()`