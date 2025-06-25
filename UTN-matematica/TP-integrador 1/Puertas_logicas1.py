# Simulador de puertas lógicas

def validar_binario(valor):
    # Verifica si la entrada es 0 o 1
    return valor in ['0', '1']

def obtener_valor(mensaje):
    valor = input(mensaje)
    while not validar_binario(valor):
        print("Entrada inválida. Ingrese 0 o 1.")
        valor = input(mensaje)
    return int(valor)

def puerta_and(a, b):
    return a and b

def puerta_or(a, b):
    return a or b

def puerta_not(a):
    return int(not a)

def mostrar_menu():
    print("\n--- Simulador de Puertas Lógicas ---")
    print("1. AND")
    print("2. OR")
    print("3. NOT")
    print("4. Salir")

while True:
    mostrar_menu()
    opcion = input("Seleccione una operación (1-4): ")

    if opcion == '1':
        a = obtener_valor("Ingrese el primer valor (0 o 1): ")
        b = obtener_valor("Ingrese el segundo valor (0 o 1): ")
        print(f"{a} AND {b} = {puerta_and(a, b)}")

    elif opcion == '2':
        a = obtener_valor("Ingrese el primer valor (0 o 1): ")
        b = obtener_valor("Ingrese el segundo valor (0 o 1): ")
        print(f"{a} OR {b} = {puerta_or(a, b)}")

    elif opcion == '3':
        a = obtener_valor("Ingrese el valor para NOT (0 o 1): ")
        print(f"NOT {a} = {puerta_not(a)}")

    elif opcion == '4':
        print("¡Gracias por usar el simulador!")
        break

    else:
        print("Opción no válida. Intente nuevamente.")

