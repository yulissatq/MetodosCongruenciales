# MetodosCongruenciales
Metodos Congruenciales para generar numeros pseudo aleatorios. Metodo Congruencial Mixto y Multiplicativo.
# Metodo Congruencial Mixto
Es un algoritmo utilizado para la generación de números aleatorios, mediante la siguiente formula:
Xn+1 = ((a)Xn + c) mod m
# Ejecucion del Programa
1.  Para generar numeros Pseudo Aleatorios con el Metodo Congruencial Mixto se neceseita calcular el parametro de 'm', m = 2^d.
Se ingresa el valor de 'd' que tiene que ser entero y mayor que 0:
<img src="mixto1d.PNG" />
En caso de que el usu no ingrese un valor acorde para cumplir las condiciones se le presentara un mensaje de error indicandole las condiciones necesarias para que se acepte el valor correcto y regresara a la primera pantalla para su ingreso
<img src= "mixto1drest.PNG"/>
2. Para calcular el parámetro de ‘a’, se hace uso de la formula a = 1 + (4 * k).
Se ingresa el valor de ‘k’ que tiene que ser entero y mayor que 0:
<img src="mixto2k.PNG" />
Para todos los ingresos de valores en caso de no cumpli las condiciones se presentara mensajes  como el mencionado anteriormente
3.  Se ingresa el valor  de xn que tiene que ser entero y mayor que 0:
<img src="mixto3xn.PNG"/>
4.  Se generan los resultados
<img src="mixto4rc.PNG"/>

# Metodo Congruencial Multiplicativo
Es un metodo utilizado para la generacion de numeros  aleatorios, mediante la siguiente formula:
Xn+1= (a)Xn * mod m
# Ejecucion del Programa
1. Para generar numeros Pseudo Aleatorios con el Metodo Congruencial Multiplicativo se neceseita calcular el parametro de 'm', m = 2^d.
Se ingresa el valor de 'd' que tiene que ser entero y mayor que 0:
<img src="multi1d.PNG"/>
En el caso de que el usuario no ingrese un valor que cumpla las condiciones, se presenta  un mensaje de error, se indican las condiciones necesarias para que se ingrese el valor correcto
<img src="multi1drest.PNG"/>
2. Para calcular el parametro de 'a', se hace uso de la formula a = 5 + (8 * k).
Se ingresa el valor de 'k' que tiene que ser entero y mayor que 0:
<img src="multi2k.PNG"/>
Para todos los ingresos de valores en caso de no cumpplir las condicions, se presentan mensajes como el mencionado anteriormente
Se ingresa el valor de xn  que debe ser un numero impar:
<img src="multi3xn.PNG"/>
4. Se generan los resultados
<img src=multi4rc.PNG"/>
