package com.ipartek.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <b>Clase cancion</b>
 * <p>esta clase define un objeto cancion.</p>
 * <p>los datos los obtiene de la tabla canciones de la BD</p>
 * 
 * @author Alain
 * @author Ana
 * 
 * @version 1.2.0
 * 
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cancion {
	
	/**
	 * Atributo id. en la BD es automatico y PK.
	 * no admite valores nulos.
	 */
	private int id_cancion;
	
	/**
	 * valor que representa el título. Tiene un limite de 45 carácteres. 
	 */
	private String titulo;
	
	
	private String enlace;
	private String estilo_cancion;
	private String descripcion_cancion;
	private int FK_usuario;
	
	private String usuario;
	
}
