/*

- Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

- Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.

*/

class Main {
    public static void main(String[] args) {
        suma(22,51,27);
        
        Coche miCoche = new Coche();
        
        miCoche.Incrementar();
        miCoche.Incrementar();
        miCoche.Incrementar();
        System.out.println("El auto tiene " + miCoche.numeroDePuertas + " puertas");
    }
    
    public static void suma(int valor1, int valor2, int valor3){
        int resultado;
        resultado = valor1 + valor2 + valor3;
        System.out.println(resultado);
    }
}

class Coche {
    public int numeroDePuertas = 4;
    
    public void Incrementar(){
        this.numeroDePuertas ++;
    }
}