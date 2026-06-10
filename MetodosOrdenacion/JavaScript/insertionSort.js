function insertionSort(arr) {
    for (let i = 1; i < arr.length; i++) {
        const llave = arr[i];
        let j = i - 1;
        while (j >= 0 && arr[j] > llave) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = llave;
    }
    return arr;
}

// Uso:
const datos = [5, 2, 4, 6, 1, 3];
console.log("Resultado:", insertionSort(datos));
// [1, 2, 3, 4, 5, 6]
