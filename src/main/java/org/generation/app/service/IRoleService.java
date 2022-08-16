package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Role;

public interface IRoleService {
	/**
	 * Enlista todos las ordenes de la base de datos
	 * @param Role 
	 * @return Listado de ordenes
	 */
	public List<Role> findAllRoles();
	/**
	 * Nos guarda la orden en la base de datos
	 * @param Role Datos de la orden
	 * @return Devuelve la orden con el Id asignado
	 */ 
	public Role saveRole(Role Role); 
	
	/**
	 * Elimina el role de la base de datos
	 * @param Id identificador de la orden a eliminar
	 */
	public Role deleteRoleById(Long id);
	
	/**
	 * Encontrar el role en la base de datos
	 * @param Id identificador de la orden a buscar
	 * @return
	 */
	public Role findRoleById(Long id);
	
	
}
