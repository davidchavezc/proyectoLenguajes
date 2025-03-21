#include <stdio.h>

int main() {
    int suma = 0;
    double promedio = 0;
    int arreglo[] = {4, 7, 9, 5, 20, 8, 32, 2, 1, 56};

    int n = sizeof(arreglo) / sizeof(arreglo[0]); // Tamaño del arreglo, sizeof devuelve el tamaño 
    // en bytes por lo que se usa recursivamente para obtener el tamaño en elementos

    for (int i = 0; i < n; i++) {
        suma += arreglo[i];
    }
    promedio = (double)suma / n;
    printf("La suma del arreglo es %i\n", suma);
    printf("El promedio del arreglo es %.2f\n", promedio);
    return 0;
}