# YesFlix_v8: Red Social para compartir contenidos multimedia

## Presentación
Hola, quería presentaros este proyecto que estamos haciendo para poder compartir nuestras series, películas y canciones favoritas.  
Este proyecto se basa en una página web hecha con JavaEE.

### Requisitos
Para poder colaborar con el proyecto necesitaras:
#### Software para el desarrollo
* Java JDK17
* Eclipse (proyecto realizado con versión 2025-3)
* MySQL Server (versión 8.0)

#### Librerias descargadas de Maven
* MySQL driver j 9.3.0
* lombok

## Organización del proyecto
### Organización de paquetes
* **com.ipartek:** este paquete contenedrá la clase java que cargará el proyecto.
* **com.ipartek.moelo:** la gestión de la BD.
* **com.ipartek.moelo.dto:** las clases que se encrgan de enlazar con las tablas de la BD.
 
### Organización de las vistas
La interfaz de usuario está realizada con **HTML** y **CSS**, y los archivos de la interfaz son archivos JSP, para los JSP, utilizamos la sintaxis antigua.

## Configuración del proyecto
Para poder arrancar el proyecto, será necesario contar con una BD.  
Se suministra el código SQL con las tablas y datos de prueba para poder crear dicha BD en MySQL se encuentra [AQUI](https://github.com/Unai09/YesFlix_v8/blob/main/BD_inventario_v5.sql)

