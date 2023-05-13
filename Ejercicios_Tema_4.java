/* 

- En este ejercicio practicaras las estructuras de control, para 
ello deberas crear:

- Usando un if, crear una condicion que compare si la variable
numeroIf es positivo, negativo, o 0.
Pista: Los numeros inferiores a 0 son negativos y los superiores,
positivos.

- Crea un bucle While, este bucle tendra que tener como condicion 
que la variable numeroWhile sea inferior a 3, el bloque de codigo 
que tendra el bucle debera:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

- Para el bucle Do While, deberas crear la misma estructura que en
el While, pero solo se debe ejecutar una vez.

- Para el bucle For, crea una variable numeroFor, esta variable
tendra como valor 0 y su condicion sera que la variable sea igual o
menor que 3, se ira incrementando en 1 su valor cada vez que se
ejecute y debera mostrarse por pantalla.

- Por ultimo, para el Switch, deberas crear la variable estacion, y
distintos case para las cuatro estaciones del anio. Dependiendo del
valor de la variable estacion se debera mandar un mensaje por
consola informando de la estacion en la que esta. Tambien habra que
poner un default para cuando el valor de la variable no sea una
estacion.

*/

class HelloWorld {
    public static void main(String[] args) {
        
        //------------------- condicionales --------------------//    
        
        int numeroIf = 1;
        
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        }
        else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es 0");
        }
        
        //-------------------- while ------------------------//
        
        int numeroWhile = 0;
        
        while (numeroWhile < 3) 
        {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        //--------------------- do while ------------------------//
        
        int numeroDoWhile = 2;
        
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
        
        //--------------------- for --------------------------//
        
        for (int numeroFor=0;numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        //--------------------- switch ------------------------//
        
        var estacion = "Primavera";
        
        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otonio":
                System.out.println("Estamos en Otonio");
                break;
            case "Invierno":
                System.out.println("Estamose en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("No es una Estacion");
        }
    }    
}