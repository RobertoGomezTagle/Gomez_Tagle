# ¿Que es una coleccion en Java?

> Una colección representa un grupo de objetos. Esto objetos son conocidos como elementos. Cuando queremos trabajar con un conjunto de elementos, necesitamos un almacén donde poder guardarlos. En Java, se emplea la interfaz genérica Collection para este propósito. Gracias a esta interfaz, podemos almacenar cualquier tipo de objeto y podemos usar una serie de métodos comunes, como pueden ser: añadir, eliminar, obtener el tamaño de la colección… Partiendo de la interfaz genérica Collection extienden otra serie de interfaces genéricas. Estas subinterfaces aportan distintas funcionalidades sobre la interfaz anterior.

## Tipos de coleccion

> - Conjunto – los elementos no tienen un orden y no se permiten duplicados.Se define el interfaz Set<E>. Podemos utilizar las siguientes implementaciones:  HashSet<E> (implementación con tabla hash), LinkedHashSet<E> (tabla hash +doble lista enlazada), TreeSet<E> (implementación con árbol)

> - Listas – estructura secuencial, donde cada elemento tiene un índice o posición. Se utiliza el interfaz List<E>. Podemos utilizar las siguientes implementaciones: ArrayList<E> (acceso rápido), LinkedList<E>(inserciones/borrado rápidas), Stack<E> (pila), Vector<E> (obsoleto)

> - Diccionario o Matriz asociativa – cada elemento tiene asociado una clave que usaremos para recuperarlo.  Se utiliza el interfaz Map<K,V>. Podemos utilizar las siguientes implementaciones: HashMap<K,V>, TreeMap<K,V>, LinkedHashMap<K,V>

# Java Collection Framework

> Java Collection Framework es como se conoce a la librería de clases contenedoras de Java que podemos encontrar en el paquete estándar java.util. Estas clases sirven para almacenar colecciones de objetos, como listas, conjuntos, mapas, …
>Todas estas clases permiten guardar en ellas referencias a objetos (no podemos usarlas a priori con tipos primitivos como int o double). Por ejemplo:
  
- // Lista de enteros. Puede haber enteros repetidos en la lista:
List<Integer> lista_de_manzanas;  

- // Conjunto de enteros. No puede haber enteros repetidos:
Set<Integer> conjunto_de_naranjas;

- // Un mapa que asocia a una cadena un entero, como en una lista de notas de un examen:
//    [("Juan Goytisolo", 9.5), ("Pablo Iglesias", 5.0), ...]
Map<String, Integer> mapa_de_notas;
