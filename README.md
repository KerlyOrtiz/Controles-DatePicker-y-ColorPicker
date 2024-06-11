# Selección de Fecha y Color GUI
![](https://scontent.fgye30-1.fna.fbcdn.net/v/t1.15752-9/447671019_342673111969997_7677977606108277394_n.png?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeEN6vn_1-hdixFq3pkhoTVHwU3kqUViSJLBTeSpRWJIkg_VVrpb7_K6-AqGytx9Y_GuzOuof37AhQCLy9M8t501&_nc_ohc=ScGR8_ohgWIQ7kNvgFLK9LS&_nc_ht=scontent.fgye30-1.fna&oh=03_Q7cD1QGQFDTc3CguLDAPkTjz_frhYAJVRO-a2dd2KBvIkiE6mQ&oe=668F3931)

Este proyecto es una aplicación de JavaFX que proporciona una interfaz gráfica de usuario (GUI) para seleccionar una fecha y un color. Permite a los usuarios elegir una fecha específica desde un calendario desplegable y un color desde una paleta de colores. Al confirmar la selección, la fecha y el color elegidos se muestran en la consola.

## Características

- **DatePicker**: Un control de selección de fecha que permite al usuario seleccionar una fecha específica desde un calendario desplegable.
- **ColorPicker**: Un control de selección de color que permite al usuario elegir un color específico desde una paleta de colores.
- **Botón "Confirmar"**: Un botón para confirmar la selección de la fecha y el color.
- **Etiquetas**: Etiquetas para guiar al usuario sobre qué hacer (por ejemplo, "Selecciona una fecha:" y "Selecciona un color:").
- **VBox Layout**: Los controles están organizados en un layout vertical (VBox) para una apariencia ordenada y clara.
- **Centrado y dimensiones fijas**: La interfaz de usuario está centrada en la ventana y tiene un tamaño fijo de 300x250 píxeles.
- **Ancho personalizado**: El `DatePicker` y el `ColorPicker` tienen un ancho preferido de 200 píxeles.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- JavaFX SDK (incluido en el JDK a partir de la versión 8)

## Ejecución

1. Clona este repositorio en tu máquina local.
2. Abre un terminal y navega hasta el directorio del proyecto.
3. Compila el código fuente ejecutando el siguiente comando:

## Uso

1. Selecciona una fecha utilizando el `DatePicker`.
2. Selecciona un color utilizando el `ColorPicker`.
3. Haz clic en el botón "Confirmar" para enviar tu selección.
4. La fecha y el color seleccionados se mostrarán en la consola.

## Personalización

Puedes personalizar el diseño y la funcionalidad de la aplicación modificando el código fuente en `FechaColorGUI.java`. Por ejemplo, puedes cambiar los estilos CSS, agregar nuevos controles o implementar lógica adicional para manejar eventos y interacciones del usuario.
