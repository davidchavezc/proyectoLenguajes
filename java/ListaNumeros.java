public class ListaNumeros {
    static int sumarNumeros(int array[]) {
        int suma = 0;
        int sizeOfArray = array.length;
        for (int i = 0; i < sizeOfArray; i++) {
            suma += array[i];
        }
        return suma;
    }

    static float sacarPromedio(int array[]) {
        float promedio = 0;
        int sizeOfArray = array.length;
        int suma = sumarNumeros(array);
        promedio = (float) suma / sizeOfArray;
        return promedio;
    }
}