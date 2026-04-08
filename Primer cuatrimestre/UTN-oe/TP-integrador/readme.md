# Trabajo Integrador Final – Organización Empresarial

## Video
https://youtu.be/BtpdI-6XgCs

## Descripción

Este repositorio contiene la entrega del Trabajo Integrador Final de la materia **Organización Empresarial** de la Tecnicatura Universitaria en Programación a Distancia. El objetivo es modelar un proceso de atención al cliente en una tienda online mediante BPMN y desarrollar un chatbot básico en Dialogflow para automatizar respuestas a preguntas frecuentes.

## 1. Diagrama BPMN

- **Start Event**: Inicio de la consulta del cliente.
- **Tarea "Recibir consulta"**: El chatbot captura el mensaje del cliente.
- **Tarea "Analizar intención"**: El sistema identifica la intención del usuario.
- **Tarea "Buscar respuesta"**: Se consulta la base de conocimientos.
- **Exclusive Gateway (X)**: Punto de decisión “¿Hay respuesta?”.
  - **Sí** → Tarea "Enviar respuesta" → End Event.
  - **No** → Tarea "Derivar a humano" → End Event.

## 2. Chatbot TiendaBot (Dialogflow)

El chatbot fue creado en **Dialogflow** con estas intenciones:

| Intención         | Frases de entrenamiento                       | Respuesta                                                                |
| ----------------- | --------------------------------------------- | ------------------------------------------------------------------------ |
| MediosDePago      | ¿Qué medios de pago aceptan?, ¿Tarjeta?…      | Aceptamos tarjetas de crédito, débito, transferencia y Mercado Pago.     |
| HorarioDeAtencion | ¿Cuál es el horario?, ¿Abren los sábados?…    | Nuestro horario es de lunes a viernes de 9 a 18 hs.                      |
| EnvioInterior     | ¿Hacen envíos al interior?, ¿Envíos Córdoba?… | Sí, realizamos envíos a todo el país por Correo Argentino.               |
| HacerReclamo      | ¿Cómo hago un reclamo?, ¿Dónde quejarme?…     | Podés escribirnos por WhatsApp al 11-1234-5678 o usar el formulario web. |
| TiempoDeEnvio     | ¿Cuánto tarda el envío?, ¿Tiempo de entrega?… | El tiempo estimado es de 3 a 5 días hábiles.                             |

## Integrantes

- **Integrante 1**: Modelado BPMN y explicación del proceso.
- **Integrante 2**: Configuración y demostración del chatbot.


