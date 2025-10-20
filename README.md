# Sostenibilidad

## Programa "Viviendas por Intensidad de Uso"
Este proyecto muestra los municipios con mayor intensidad de uso de viviendas a partir de su mediana de consumo anual en los municipios de la Comunidad de Madrid (datos del año 2021). Para ello, el programa lee un archivo CSV de la plataforma [datos.gob.es](https://datos.gob.es/es/).

### Problema a resolver
- Leer CSV con los datos del consumo eléctrico
- Mostrar municipios con mayor valor de intensidad de uso, incluyendo territorio, valor y código
- Permitir indicar el número de municipios a mostrar
- Ordenar los resultados de manera descendente según el valor

### Tecnologías
Las tecnologías empleadas para este proyecto son:
- Lenguaje: Java
- Entorno de desarrollo: Visual Studio Code

### Código
#### Clase _Vivienda_
- Método `toString()`: da formato de salida mostrando el territorio, el código y el valor
~~~
public String toString() { //Formato en el que se imprimirá
        return "Territorio: "+this.territorio + " | Código: " + this.codigo + " | Valor: " + this.valor;
    }
~~~
- Método `compareTo()`: permite ordenar las viviendas de manera descendente según el valor
~~~
 public int compareTo(Vivienda otra) { //Ordenar de manera descendente según el valor
        return otra.getValor() - this.valor;
    }
~~~
      
#### Programa principal _ConsumoElectrico_
- El programa acepta dos argumentos:
  
  1. Ruta del CSV
  2. Cantidad de municipios a mostrar. Si no especifica, será 3 por defecto

Funcionamiento:
- Lee el CSV línea a línea mediante un bucle `while`, utilizando un `BufferedReader` y omitiendo la cabecera
- Crea objetos de la clase `Vivienda` a partir de los datos del CSV y los almacena en un `ArrayList`
- Ordena la lista de viviendas según el valor de consumo
- Muestra por pantalla el número solicitado de casos con mayor consumo

