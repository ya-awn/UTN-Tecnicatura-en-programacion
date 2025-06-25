## se uso como referencia para hacer el codigo de puertas_logicas2.py
## la forma en como define las funciones de la tabla y la forma simplificada en la que llama al menu
def puerta_and(a, b): return a & b
def puerta_or(a, b): return a | b
def puerta_not(a): return int(not a)
def puerta_xor(a, b): return a ^ b
def puerta_nand(a, b): return int(not (a and b))
def puerta_nor(a, b): return int(not (a or b))

def tabla_verdad_binaria(funcion, nombre):
    print(f"\nTabla de Verdad - {nombre}")
    print("A | B | Resultado")
    for a in [0, 1]:
        for b in [0, 1]:
            print(f"{a} | {b} |    {funcion(a, b)}")

def tabla_not():
    print("\nTabla de Verdad - NOT")
    print("A | NOT A")
    for a in [0, 1]:
        print(f"{a} |   {puerta_not(a)}")

def menu():
    print("\n--- SIMULADOR DE PUERTAS LÓGICAS ---")
    print("1. AND\n2. OR\n3. NOT\n4. XOR\n5. NAND\n6. NOR\n7. Salir")

while True:
    menu()
    op = input("Seleccione una opción (1-7): ")
    if op == '1':
        tabla_verdad_binaria(puerta_and, "AND")
    elif op == '2':
        tabla_verdad_binaria(puerta_or, "OR")
    elif op == '3':
        tabla_not()
    elif op == '4':
        tabla_verdad_binaria(puerta_xor, "XOR")
    elif op == '5':
        tabla_verdad_binaria(puerta_nand, "NAND")
    elif op == '6':
        tabla_verdad_binaria(puerta_nor, "NOR")
    elif op == '7':
        print("¡Gracias por usar el simulador!")
        break
    else:
        print("Opción inválida.")
