import matplotlib.pyplot as plt
from matplotlib_venn import venn3, venn3_circles

CURRENT_YEAR = 2025

def bisiesto(anio): #devuelve true si un año es bisiesto
    return(anio % 400 == 0) or (anio % 4 == 0 and anio % 100 != 0)

def dni_anio(i): #ingreso de dni y año de nacimiento
    dni = input(f"Ingrese DNI, persona {i}: ").strip()
    anio = int(input(f"Ingrese año de nacimiento, persona {i}: "))
    return dni,anio

def set_digitos(dni): #convierte dni(string) en un conjunto de digitos unicos
    return set(dni)

def frecuencia_digitos(dni): #cuenta cuantas veces aparece cada digito en el dni
    freq = {}
    for i in dni:
        freq[i] = freq.get(i, 0) + 1
    return freq

def suma_digitos(dni): #suma todos los digitos del dni
    return sum(int(i)for i in dni)

def mostrar_venn3(A, B, C, etiquetas): #dibuja diagrama de venn con 3 conjuntos etiquetando cada region con digitos reales
    #calcula las 7 regiones
    onlyA = A - B - C
    onlyB = B - A - C
    onlyC = C - A - B
    AB    = (A & B) - C
    AC    = (A & C) - B
    BC    = (B & C) - A
    ABC   = A & B & C

    sizes = (
        len(onlyA),
        len(onlyB),
        len(AB),
        len(onlyC),
        len(AC),
        len(BC),
        len(ABC)
    )
    diagram = venn3(subsets=sizes, set_labels=etiquetas)
    venn3_circles(subsets=sizes, linestyle='dotted')

    mapping = {
        '100': sorted(onlyA),
        '010': sorted(onlyB),
        '110': sorted(AB),
        '001': sorted(onlyC),
        '101': sorted(AC),
        '011': sorted(BC),
        '111': sorted(ABC),
    }
    for region_id, elems in mapping.items():
        txt = "\n".join(elems)
        lbl = diagram.get_label_by_id(region_id)
        if lbl:
            lbl.set_text(txt)
            lbl.set_fontsize(8)

    plt.title("Diagrama de venn de digitos unicos (3 constantes)")
    plt.tight_layout()
    plt.show()

def main():
    #1 pedir 3 dni y años de nacimiento
    datos = [dni_anio(i) for i in (1, 2, 3)]
    dnis, años = zip(*datos)

    #2 generar conjuntos y analisis individual
    conjuntos = []
    print("\n=== Analisis individual de cada dni ===")
    for i, dni in enumerate(dnis, start=1):
        c = set_digitos(dni)
        conjuntos.append(c)
        print(f"\nIntegrante {i}: dni = {dni}")
        print(f"  Digitos unicos     : {sorted(c)} ")
        print(f"  Frecuencia digitos : {frecuencia_digitos(dni)}")
        print(f"  suma digitos       : {suma_digitos(dni)}")
        if len(c) > 6:
            print(" * Diversidad numerica alta *")

    #3 operaciones entre pares
    print("\n=== Operaciones entre pares de conjuntos ===")
    pares = [ (0,1), (0,2), (1,2) ]
    for i, j in pares:
        A, B = conjuntos[i], conjuntos[j]
        print(f"\nPar integrante {i+1} vs {j+1:}:")
        print(f"  Union               :{sorted(A | B)}")
        print(f"  Interseccion        :{sorted(A & B)}")
        print(f"  Diferencia A - B    :{sorted(A - B)}")
        print(f"  Diferencia B - A    :{sorted(B - A)}")
        print(f"  Diferencia simetrica:{sorted(A ^ B)}")

    #4 digitos compartidos entre los 3
    comunes = set.intersection(*conjuntos)
    if comunes:
        print(f"\nDigito(s) compartido(s) por los 3: {sorted(comunes)}")
    else:
        print("\nNo hay digitos compartidos por los 3")
    
    #5 mostrar diagrama de Venn
    print("\nMostrando diagrama de Venn de los 3 conjuntos: ")
    mostrar_venn3(conjuntos[0], conjuntos[1], conjuntos[2],
                  etiquetas=("Int. 1","Int. 2","Int. 3"))
    
    #6 analisis de años de nacimiento
    print("\n=== Analisis de años de nacimiento ===")
    pares_años   = sum(1 for a in años if a % 2 == 0)
    impares_años = 3 - pares_años
    print(f"Años pares: {pares_años}, Años impares: {impares_años}")
    if all(a > 2000 for a in años):
        print("  * Todos pertenecen al grupo Z")
    if any(bisiesto(a) for a in años):
        print("  * almenos 1 es año bisiesto ")
    
    #7 calcula edades y producto cartesiano
    edades = [CURRENT_YEAR - a for a in años]
    print(f"\nEdades (en {CURRENT_YEAR}): {edades}")
    cart = [(a, e) for a in años for e in edades]
    print(f"Producto cartesiano (año, edad): {cart}")

if __name__ == "__main__":
    main()