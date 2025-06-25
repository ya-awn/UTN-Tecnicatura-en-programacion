# Generador de tablas de verdad para puertas lógicas: AND, OR, NOT, XOR, NAND, NOR

def tabla_and():
    print("\nTabla de verdad - AND")
    print("A | B | A AND B")
    print("-----------------")
    for a in [0, 1]:
        for b in [0, 1]:
            print(f"{a} | {b} |   {a & b}")

def tabla_or():
    print("\nTabla de verdad - OR")
    print("A | B | A OR B")
    print("----------------")
    for a in [0, 1]:
        for b in [0, 1]:
            print(f"{a} | {b} |   {a | b}")

def tabla_not():
    print("\nTabla de verdad - NOT")
    print("A | NOT A")
    print("----------")
    for a in [0, 1]:
        print(f"{a} |   {int(not a)}")

def tabla_xor():
    print("\nTabla de verdad - XOR")
    print("A | B | A XOR B")
    print("-----------------")
    for a in [0, 1]:
        for b in [0, 1]:
            print(f"{a} | {b} |   {a ^ b}")

def tabla_nand():
    print("\nTabla de verdad - NAND")
    print("A | B | A NAND B")
    print("------------------")
    for a in [0, 1]:
        for b in [0, 1]:
            resultado = int(not (a & b))
            print(f"{a} | {b} |    {resultado}")

def tabla_nor():
    print("\nTabla de verdad - NOR")
    print("A | B | A NOR B")
    print("-----------------")
    for a in [0, 1]:
        for b in [0, 1]:
            resultado = int(not (a | b))
            print(f"{a} | {b} |   {resultado}")

def mostrar_menu():
    print("\n--- Generador de Tablas de Verdad ---")
    print("1. Tabla AND")
    print("2. Tabla OR")
    print("3. Tabla NOT")
    print("4. Tabla XOR")
    print("5. Tabla NAND")
    print("6. Tabla NOR")
    print("7. Salir")

while True:
    mostrar_menu()
    opcion = input("Seleccione una opción (1-7): ")

    if opcion == '1':
        tabla_and()
    elif opcion == '2':
        tabla_or()
    elif opcion == '3':
        tabla_not()
    elif opcion == '4':
        tabla_xor()
    elif opcion == '5':
        tabla_nand()
    elif opcion == '6':
        tabla_nor()
    elif opcion == '7':
        print("Fin del programa.")
        break
    else:
        print("Opción inválida. Intente nuevamente.")
