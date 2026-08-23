Algoritmo esPrimo
  definir n como Entero
  Escribir "Ingrese un numero: "
  leer n

  si n < 0 Entonces
    Escribir "Error: No aceptan numeros negativos."
  SiNo
    si n == 0 o n == 1 Entonces
      Escribir "Falso"
    SiNo
      si n == 2 Entonces
        Escribir "Verdadero"
      SiNo
        si n % 2 == 0 Entonces
          Escribir "Falso"
          SiNo
            Escribir "Verdadero"
          Finsi
        Finsi
      Finsi
    Finsi
  FinAlgoritmo

  | Caso | Entrada (n) | Resultado esperado | Tipo de caso |
|------|-------------|---------------------|----------------|
| 1    | 0           | Falso               | Límite         |
| 2    | 1           | Falso               | Límite         |
| 3    | 2           | Verdadero           | Límite         |
| 4    | -5          | Error               | Caso de error  |
| 5    | 7           | Verdadero           | Normal         |
