let suma =0, promedio = 0;
let arreglo = [4, 7, 9, 5, 20, 8, 32, 2, 1, 56]
for (let i = 0; i < arreglo.length; i++) {
    suma += arreglo[i];
}
promedio = suma / arreglo.length;
console.log(`La suma del arreglo es: ${suma}`);
console.log(`El promedio del arreglo es: ${promedio}`);