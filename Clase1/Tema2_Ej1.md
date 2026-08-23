## Fragmento (a): O(1)


imprimir arr[0]


No tiene ningún bucle, se ejecuta una sola vez sin importar el valor de n.

## Fragmento (b): O(n²)


para i de 0 a n
  para j de 0 a n
    imprimir i, j


Tiene un bucle adentro de otro, los dos recorren n. Por cada vuelta del externo, el interno da n vueltas completas, entonces en total son n * n = n² ejecuciones.

## Fragmento (c): O(log n)


mientras n > 1
  n = n / 2
  contador++


En cada vuelta n se divide por 2, achicando el problema a la mitad cada vez. La cantidad de vueltas que hacen falta para llegar a 1 es el logaritmo en base 2 de n.

## Fragmento (d): O(n³)


para i de 0 a n
  para j de 0 a n
    para k de 0 a n
      imprimir i, j, k


Son 3 bucles, cada uno recorre n. Siguiendo la misma lógica que el fragmento (b) pero con un bucle más, el total queda n * n * n = n³ ejecuciones.
