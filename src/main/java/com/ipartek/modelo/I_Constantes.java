package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_aplicacion_music";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/" + BD;
	String USUARIO = "root";
	String PASS = "1234";

	// CONSTANTES DE LOS JSP
	String JSP_INDEX = "index.jsp"; 
	String JSP_GESTION = "gestion.jsp"; 
	String JSP_CANCIONES = "canciones.jsp"; 
	String JSP_SERIES = "series.jsp"; 
	String JSP_PELICULAS = "peliculas.jsp";

	// CONSTANTES DE PROCEDURES
	String TABLA_CANCIONES = "canciones";
	String CANCIONES_ID_CANCION = "id_cancion";
	String CANCIONES_TITULO = "titulo";
	String CANCIONES_ENLACE = "enlace";
	String CANCIONES_ESTILO_CANCION = "estilo_cancion";
	String CANCIONES_DESCRIPCION_CANCION = "descripcion_cancion";
	String CANCIONES_FK_USUARIO = "FK_usuario";
	String CANCIONES_USUARIO = "usuario";

	String TABLA_PELICULAS = "peliculas";
	String PELICULAS_ID_PELICULA = "id_pelicula";
	String PELICULAS_PELICULA = "pelicula";
	String PELICULAS_DURACION = "duracion";
	String PELICULAS_DESCRIPCION_PELICULA = "descripcion_pelicula";
	String PELICULAS_ESTILO_PELICULA = "estilo_pelicula";
	String PELICULAS_FK_USUARIO = "FK_usuario";
	String PELICULAS_USUARIO = "usuario";
	
	String TABLA_SERIES = "series";
	String SERIES_ID_SERIE = "id_serie";
	String SERIES_SERIE = "serie";
	String SERIES_NUM_TEMP = "num_temporadas";
	String SERIES_DESCRIPCION_SERIE = "descripcion_serie";
	String SERIES_FK_USUARIO = "FK_usuario";
	String SERIES_USUARIO = "usuario";
	
	String TABLA_USUARIOS = "usuarios";
	String USUARIO_ID_USUARIO = "id_usuario";
	String USUARIO_USUARIO = "usuario";
	String USUARIO_PASSWORD = "pass";
	String USUARIO_FK_ROL = "FK_rol";

	String TABLA_ROLES = "roles";
	String ROLES_ID_ROL = "id_rol";
	String ROLES_ROL = "rol";
	
	
	//atributos
	String ATR_LISTA_PELICULAS="atr_lista_pelis";
	String ATR_LISTA_SERIES="atr_lista_series";
	String ATR_LISTA_CANCIONES="atr_lista_canciones";
	
	//atributos de la session
	String S_ATR_USUARIO="s_atr_usuario";
	
	// STORED PROCEDURES
	String SP_PELIS_OBTENER_TODAS="call sp_peliculas_obtener_todas();";
	String SP_SERIES_OBTENER_TODAS="call sp_series_obtener_todas();";
	String SP_CANCIONES_OBTENER_TODAS="call sp_canciones_obtener_todas();";
	
	String SP_USUARIOS_VALIDAR="call sp_verificar_usuario(?, ?);";
}
