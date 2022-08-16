package org.generation.app.controller;

import java.util.List;

import org.generation.app.entity.Role;
import org.generation.app.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api") //localhost:port/api
public class RoleRestController {
	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/roles") //localhost:puerto/api/roles
	public List<Role> roles(){
		return roleService.findAllRoles();		
	}
	
	@GetMapping("/roles/{id}")
	public Role roleById(@PathVariable Long id) {		
		return roleService.findRoleById(id);
	}
	
	@PostMapping("/roles")
	public Role newRole(@RequestBody Role role) {
		role.setRoleId(null);
		return roleService.saveRole(role);
	}
	
	@PutMapping("/roles")
	public Role replaceRole(@RequestBody Role role) {
		//Filtros para asegurar que esté un ID y exista
		return roleService.saveRole(role);
	}
	
	@DeleteMapping("roles/{id}")
	public Role byeRole(@PathVariable Long id) {
		return roleService.deleteRoleById(id);
	}

	

}
