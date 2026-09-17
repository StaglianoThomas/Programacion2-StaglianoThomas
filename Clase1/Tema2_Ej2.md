 ALGORITMO 1 FUERZA BRUTA.
```
Algoritmo Duplicados(arreglo, n)
    para i desde 0 hasta n-1 hacer
     para j desde i+1 hasta n-1 hacer
       Si arreglo[i] == arreglo[j] entonces
         retornar Verdadero
      FinSi
    FinPara
  FinPara
  retornar Falso
FinAlgoritmo
```
 COMPLEJIDAD: O(n^2) dos bucles anidados

 ALGORITMO 2: ORDENAR Y COMPARAR CONSECUTIVOS.
```
Algoritmo duplicadosOrdenados(arreglo, n)
    ordernar(arreglo)
    para i desde 0 hasta n-2 hacer
       Si arreglo[i] == arreglo[i+1] entonces
         retornar Verdadero
      FinSi
    FinPara
    retornar Falso
FinAlgoritmo
```
 COMPLEJIDAD: O(n log n) ordenar domina sobre el recorrido simple O(n)

Para 1.000.000 de elementos, conviene el Algoritmo 2, porque O(n log n) requiere menos operaciones que O(n^2). La diferencia es de miles de veces menos trabajo, por lo tanto es mucho mas rapido.

