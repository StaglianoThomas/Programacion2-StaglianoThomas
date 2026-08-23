 # Pseudocodigo original
 
```
Algoritmo triángulos
  definir a,b,c como Entero
  Escribir "Ingrese el valor del primer lado: "
  leer a
  Escribir "Ingrese el valor del segundo lado: "
  leer b
  Escribir "Ingrese el valor del tercer lado: "
  leer c
  si a = b y b = c Entonces
    Escribir "Equilátero"
  SiNo 
    si a = b o b = c Entonces
      Escribir "Isósceles"
    SiNo
      Escribir "Escaleno"
    FinSi
  FinSi
FinAlgoritmo
```

# Casos de prueba encontrados

Caso 1:negativos o cero
- Entrada: a=-1, b=1, c=5
- Resultado del algoritmo original: Escaleno
- Resultado esperado: Error (un lado no puede ser negativo o cero)

Caso 2: Lados que no cumplen la desigualdad triangular
- Entrada: a=1, b=2, c=10
- Resultado del algoritmo original: Escaleno
- Resultado esperado: Error (1+2=3, no alcanza para llegar hasta 10. no forman un triángulo real)

# Explicación de los errores

EL Pseudocodigo tiene un problema. No se fija si los números que le pases realmente pueden formar un triangulo. Por un lado, deja pasar negativos y ceros, cuando un lado de un triangulo no puede medir eso y por otro lado, tampoco chequea que los lados cierren como triangulo, es decir, si sumas los dos lados mas chicos, tiene que dar mas que el lado mas grande, sino no se puede armar (con 1,2 y 10 no hay forma de que cierre el triangulo). Como no valida ninguna de las dos cosas, termina clasificando como Equilátero, Isósceles o Escaleno números que en realidad no forman un triangulo posible.

# Pseudocodigo corregido

```
Algoritmo triangulos
  definir a,b,c como Entero
  Escribir "Ingrese el valor del primer lado: "
  leer a
  Escribir "Ingrese el valor del segundo lado: "
  leer b
  Escribir "Ingrese el valor del tercer lado: "
  leer c
  si a <= 0 o b <= 0 o c <= 0 Entonces
    Escribir "Error"
  SiNo
    si a+b > c y a+c > b y b+c > a Entonces
      si a = b y b = c Entonces
        Escribir "Equilátero"
      SiNo
        si a = b o b = c Entonces
          Escribir "Isósceles"
        SiNo
          Escribir "Escaleno"
        FinSi
      FinSi
    SiNo
      Escribir "Error"
    FinSi
  FinSi
FinAlgoritmo
```
