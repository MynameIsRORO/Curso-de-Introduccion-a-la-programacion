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