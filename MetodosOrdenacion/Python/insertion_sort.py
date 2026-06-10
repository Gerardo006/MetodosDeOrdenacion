def insertion_sort(arr):
    for i in range(1, len(arr)):
        llave = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > llave:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = llave

if __name__ == "__main__":
    datos = [5, 2, 4, 6, 1, 3]
    insertion_sort(datos)
    print("Resultado:", datos)
    # [1, 2, 3, 4, 5, 6]
