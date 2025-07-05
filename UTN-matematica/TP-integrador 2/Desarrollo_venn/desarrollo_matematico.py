# Parte 1 – Desarrollo Matemático (Conjuntos y Lógica)
# 1. Cada integrante anota su número de DNI.

roberto_DNI = 44429780
kenyi_DNI = 93962875

# 2. A partir de los DNIs, se forman tantos conjuntos de dígitos únicos como integrantes tenga el grupo.

# vamos a representar los conjuntos en forma de listas.
conjunto_rober = [4, 2, 9, 7, 8, 0]
conjunto_kenyi = [9, 3, 6, 2, 8, 7, 5]

# 3. Se realizan las siguientes operaciones entre esos conjuntos: unión, intersección, diferencia (entre pares) y diferencia simétrica.

# Operacion Union conjunto_rober y conjunto_kenyi
conjunto_union = [4, 2, 9, 7, 8, 0, 9, 3, 6, 2, 8, 7, 5]

# Operacion Interseccion conjunto_rober y conjunto_kenyi
conjunto_interseccion = [9, 2, 7, 8]

# Operacion Interseccion (conjunto_rober - conjunto_kenyi)
conjunto_diferencia_rober_kenyi = [4, 0]
conjunto_diferencia_kenyi_rober = [3, 6, 5]

# Operacion Interseccion (conjunto_rober - conjunto_kenyi)
conjunto_diferencia_simetrica = [4, 0, 3, 6, 5]

# 4. Para cada operación, se incluye un diagrama de Venn.

###### LOS DIAGRAMAS FUERON CREADOS CON EXCALIDRAW Y SE ENCUENTRAN EN 
# FORMSA DE CAPTURAS EN LA CARPETA "DIAGRAMAS_VENN" ######

# 5. Redactar al menos dos expresiones lógicas en lenguaje natural e implementarlas en Python

# Expresiones extraidas de las sugerencias de la catedra
# Expresión 1: "Si todos los conjuntos tienen al menos 5 elementos, entonces se considera que hay una alta diversidad numérica." 

if len(conjunto_rober) >= 5 and len(conjunto_kenyi) >= 5:
    print("Hay una alta diversidad numérica")


# Expresión 2: "Si la intersección entre todos los conjuntos tiene exactamente un elemento, se considera un dígito representativo del grupo."

if len(conjunto_interseccion) == 1:
    print(f"{conjunto_interseccion[0]} es un digito representativo del grupo.")


