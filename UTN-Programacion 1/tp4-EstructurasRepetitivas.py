# Práctico 4: Estructuras repetitivas
# Soluciones en Python para tareas 1–10

# 1) Imprimir todos los enteros de 0 a 100 (inclusive), uno por línea.
print("1) Números de 0 a 100:")
for i in range(101):
    print(i)
print("\n" + "="*40 + "\n")

# 2) Contar la cantidad de dígitos de un número entero.
num = int(input("2) Ingrese un número entero para contar sus dígitos: "))
contador = 0
n = abs(num) if num != 0 else 0
if num == 0:
    contador = 1
else:
    while n > 0:
        n //= 10
        contador += 1
print(f"Tiene {contador} dígito(s).")
print("\n" + "="*40 + "\n")

# 3) Sumar todos los enteros comprendidos entre dos valores dados (excluyéndolos).
a = int(input("3) Ingrese límite inferior: "))
b = int(input("Ingrese límite superior: "))
suma = 0
for x in range(min(a, b)+1, max(a, b)):
    suma += x
print(f"Suma de enteros entre {a} y {b} (excluidos): {suma}")
print("\n" + "="*40 + "\n")

# 4) Ingresar enteros y sumarlos hasta que el usuario ingrese 0.
print("4) Ingrese números para sumar. 0 para terminar.")
total = 0
while True:
    val = int(input("  Número: "))
    if val == 0:
        break
    total += val
print(f"Total acumulado: {total}")
print("\n" + "="*40 + "\n")

# 5) Juego de adivinar un número aleatorio entre 0 y 9.
import random
secreto = random.randint(0, 9)
intentos = 0
print("5) Adivine el número [0–9]")
while True:
    intento = int(input("  Su intento: "))
    intentos += 1
    if intento == secreto:
        print(f"¡Correcto! Lo adivinó en {intentos} intento(s).")
        break
    else:
        print("  Incorrecto, intente de nuevo.")
print("\n" + "="*40 + "\n")

# 6) Imprimir en pantalla todos los números pares entre 0 y 100 en orden decreciente.
print("6) Pares de 100 a 0:")
for x in range(100, -1, -1):
    if x % 2 == 0:
        print(x)
print("\n" + "="*40 + "\n")

# 7) Calcular la suma de todos los números entre 0 y N (inclusive), donde N es positivo.
N = int(input("7) Ingrese un entero positivo N: "))
suma7 = 0
for x in range(N+1):
    suma7 += x
print(f"Suma de 0 a {N}: {suma7}")
print("\n" + "="*40 + "\n")

# 8) Leer 100 enteros e informar cuántos son pares, impares, negativos y positivos.
print("8) Ingrese 100 números:")

pares = impares = positivos = negativos = 0
count = 0

while count < 100:
    entrada = input(f"  Valor {count+1}: ")
    if not entrada.strip():
        print("    Entrada vacía. Intente de nuevo.")
        continue
    try:
        v = int(entrada)
    except ValueError:
        print("    Entrada inválida. Intente de nuevo.")
        continue

    # Conteo de paridad
    if v % 2 == 0:
        pares += 1
    else:
        impares += 1
    # Conteo de signo
    if v > 0:
        positivos += 1
    elif v < 0:
        negativos += 1

    count += 1  # Solo avanzo el contador cuando la entrada fue válida

print(f"Pares: {pares}, Impares: {impares}, Positivos: {positivos}, Negativos: {negativos}")


# 9) Leer 100 enteros y calcular la media (promedio) de ellos.
print("9) Calcular media de 100 números:")

suma = 0
count = 0

while count < 100:
    entrada = input(f"  Valor {count+1}: ")
    if not entrada.strip():
        print("    Entrada vacía. Intente de nuevo.")
        continue
    try:
        v = int(entrada)
    except ValueError:
        print("    Entrada inválida. Intente de nuevo.")
        continue

    suma += v
    count += 1  # Solo avanzamos cuando la entrada es válida

media = suma / 100
print(f"Media (promedio): {media:.2f}")


# 10) Invertir el orden de los dígitos de un número ingresado.
num10 = int(input("10) Invertir dígitos de un número entero: "))
invertido = 0
n = abs(num10)
while n > 0:
    invertido = invertido * 10 + (n % 10)
    n //= 10
if num10 < 0:
    invertido = -invertido
print(f"Número invertido: {invertido}")
