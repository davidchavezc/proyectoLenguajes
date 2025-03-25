public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 9, 5, 20, 8, 32, 2, 1, 56};
        
        int suma = ListaNumeros.sumarNumeros(numeros);
        float promedio = ListaNumeros.sacarPromedio(numeros);
        
        System.out.println("La suma del arreglo es: " + suma);
        System.out.println("El promedio del arreglo es: " + promedio);
    }
}