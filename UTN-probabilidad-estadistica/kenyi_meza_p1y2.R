# ---------------------------------------------
# TPI – P1 y P2 - kenyi meza
# ---------------------------------------------

library(readxl)

# Cargar datos con file.choose()
file_path <- file.choose()
df <- read_excel(file_path)

# Verificar nombres de columnas
print(names(df))

# Parámetros
n <- nrow(df)
k_sturges <- ceiling(1 + log2(n))   # Número óptimo de intervalos según Sturges
k <- k_sturges

# Columna de tiempo de estudio (usando índice o nombre exacto)
col_tiempo <- names(df)[11]  # Columna 11 es "TIEMPO SEMANAL en HS. DEDIC. EST. "
tiempo <- as.numeric(df[[col_tiempo]])

# Verificar si hay datos
print(paste("Número de observaciones:", length(tiempo)))
print(paste("Valores NA:", sum(is.na(tiempo))))

# Remover valores NA si los hay
tiempo <- tiempo[!is.na(tiempo)]

# Crear cortes (bins) con k intervalos
minv <- min(tiempo, na.rm = TRUE)
maxv <- max(tiempo, na.rm = TRUE)
h <- (maxv - minv) / k
breaks <- round(seq(minv, maxv, by = h), 4)
# Asegurar que el último borde sea exactamente maxv
breaks[length(breaks)] <- maxv

# Etiquetas para intervalos
labels <- paste0("I", 1:k)

# Categorizar y crear tabla de frecuencias
cut_tiempo <- cut(tiempo, breaks = breaks, include.lowest = TRUE, labels = labels, right = FALSE)
tab_abs <- as.vector(table(cut_tiempo))
tab_rel <- round(tab_abs / length(tiempo), 4)
tab_pct <- round(tab_rel * 100, 4)
tab_cumabs <- cumsum(tab_abs)
tab_cumpct <- round(tab_cumabs / length(tiempo) * 100, 4)

# Construir data.frame de tabla de frecuencias
intervalos <- sapply(1:k, function(i) {
  left <- breaks[i]
  right <- breaks[i+1]
  if(i < k) {
    sprintf("[%.4f, %.4f)", left, right)
  } else {
    sprintf("[%.4f, %.4f]", left, right)
  }
})
tabla_tiempo <- data.frame(
  Intervalo = intervalos,
  Abs = tab_abs,
  Rel = tab_rel,
  Porc = tab_pct,
  CumAbs = tab_cumabs,
  CumPct = tab_cumpct,
  stringsAsFactors = FALSE
)
print("Tabla de frecuencias - Tiempo semanal dedicado al estudio:")
print(tabla_tiempo)

# Encuestados en el 4to intervalo
if(length(labels) >= 4) {
  fourth_label <- labels[4]
  indices_fourth <- which(cut_tiempo == fourth_label)
  if(length(indices_fourth) > 0) {
    encuestados_fourth <- df[indices_fourth, "NRO. ENCUESTA"]
    cat("\nEncuestados en el 4to intervalo:\n")
    print(encuestados_fourth)
  }
}

# Tabla de frecuencias para 'SATISFACCIÓN CON LA CARRERA'
sat_col <- "SATISFACCIÓN CON LA CARRERA"
sat <- as.integer(df[[sat_col]])
# Remover valores NA
sat <- sat[!is.na(sat)]
n_sat <- length(sat)

vals <- sort(unique(c(1,2,3,4)))
tab_sat_abs <- sapply(vals, function(v) sum(sat == v, na.rm = TRUE))
tab_sat_rel <- round(tab_sat_abs / n_sat, 4)
tab_sat_pct <- round(tab_sat_rel * 100, 4)
tab_sat_cumabs <- cumsum(tab_sat_abs)
tab_sat_cumpct <- round(tab_sat_cumabs / n_sat * 100, 4)
tabla_satisf <- data.frame(
  Categoria = c("1 Muy satisfecho","2 Satisfecho","3 Insatisfecho","4 Muy insatisfecho"),
  Valor = vals,
  Abs = tab_sat_abs,
  Rel = tab_sat_rel,
  Porc = tab_sat_pct,
  CumAbs = tab_sat_cumabs,
  CumPct = tab_sat_cumpct,
  stringsAsFactors = FALSE
)
print("Tabla de frecuencias - Nivel de satisfacción con la carrera:")
print(tabla_satisf)

# Info específica para "Satisfecho" (valor 2)
if(2 %in% vals) {
  info_satisfecho <- list(
    Abs = tab_sat_abs[which(vals == 2)],
    Rel = tab_sat_rel[which(vals == 2)],
    Porc = tab_sat_pct[which(vals == 2)],
    CumAbs = tab_sat_cumabs[which(vals == 2)],
    CumPct = tab_sat_cumpct[which(vals == 2)]
  )
  print("Información para la categoría 'Satisfecho':")
  print(info_satisfecho)
}