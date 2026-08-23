Fragmento (a):
imprimir arr[0]

-No tiene ningún bucle, se ejecuta una sola vez sin importar el valor de n.
O(1)

Fragmento (b):
para i de 0 a n
  para j de 0 a n
    imprimir i, j
    
-Tiene un bucle adentro de otro, los dos recorren n. Por cada vuelta del externo, el interno da n vueltas completas, entonces en total
son n * n = n^2 ejecuciones.
O(n^2)

Fragmento (c):
mientras n > 1
  n = n / 2
  contador++
  
-En cada vuelta n se divide por 2, achicando el problema a la mitad cada vez. la cantidad de vueltas que hacen falta para llegar al 1 es el algoritmo en base 2 de n.
O(log n)

Fragmento (d):
para i de 0 a n
  para j de 0 a n
    para k de 0 a n
      imprimir i, j, k

-Son 3 bucles, cada uno recorre n. Siguiendo la misma logica que el fragmento (b) pero con un bucle mas, el total queda
n * n * n = n^3 ejecuciones.
O(n^3)
