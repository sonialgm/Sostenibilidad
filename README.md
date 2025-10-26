# Sostenibilidad

## Programa "Viviendas por Intensidad de Uso"
Este proyecto muestra los municipios con mayor intensidad de uso de viviendas a partir de su mediana de consumo eléctrico anual, utilizando datos de la Comunidad de Madrid del año 2021 procedentes de la plataforma [datos.gob.es](https://datos.gob.es/es/).

---

### Problema a resolver
- Leer CSV con los datos del consumo eléctrico.
- Mostrar municipios con mayor valor de intensidad de uso.
- Indicar opcionalmente cuántos municipios mostrar (3 por defecto).
- Ordenar los resultados de manera descendente según el valor del consumo.

---

### Tecnologías
Las tecnologías empleadas para este proyecto son:
- Lenguaje: Java.
- Entorno de desarrollo: Visual Studio Code.

---

### Código
#### Clase _Vivienda_
La clase `Vivienda` representa cada registro del archivo CSV. 
Incluye los siguientes métodos destacados:

- **Método `toString()`**: da formato de salida mostrando el territorio, el código y el valor.
```java
public String toString() { 
        return "Territorio: "+this.territorio + " | Código: " + this.codigo + " | Valor: " + this.valor;
    }
```
- **Método `compareTo()`**: permite ordenar las viviendas de manera descendente según el valor.
```java
 public int compareTo(Vivienda otra) { 
        return otra.getValor() - this.valor;
    }
```

---

#### Programa principal _ConsumoElectrico_
El programa acepta dos **argumentos de entrada**:
- Ruta del archivo CSV.
- Cantidad de municipios a mostrar. Si no se especifica, será 3 por defecto.

---

**Funcionamiento paso a paso**:
- **Validación de argumentos**: Al menos se debe introducir uno.
- **Lectura del CSV**: Se lee línea a línea utilizando un `BufferedReader` y omitiendo la cabecera. Se separa con `split(";")` para obtener los diferentes campos. Si el campo del valor contiene un guión, se sustituye por 0.
- **Almacenamiento de datos**: Crea objetos de la clase `Vivienda` a partir de los datos del CSV  y los almacena en un `ArrayList`.
- **Ordena la lista** de viviendas según el valor de consumo mediante:
  ```java
   Collections.sort(viviendas);
  ```
- Visualizar resultados: Muestra por pantalla el número solicitado de casos con mayor consumo.

---

#### Ejemplo de ejecución
**Entrada**
```bash
java ConsumoElectrico.java viviendas.csv
```

**Salida esperada**
1) Territorio: Tielmes | Código: 1467 | Valor: 3741
2) Territorio: Nuevo Baztán | Código: 1006 | Valor: 3663
3) Territorio: Torres de la Alameda | Código: 1548 | Valor: 3607



