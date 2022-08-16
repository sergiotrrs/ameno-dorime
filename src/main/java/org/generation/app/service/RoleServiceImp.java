package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Role;
import org.generation.app.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements IRoleService {

	@Autowired
	IRoleRepository roleRepository;
	
	@Override
	public List<Role> findAllRoles() {		
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Role saveRole(Role role) {		
		return roleRepository.save(role);
	}

	@Override
	public Role deleteRoleById(Long id) {
		Role Role= findRoleById(id);
		roleRepository.deleteById(id);
		return Role;
	}

	@Override
	public Role findRoleById(Long id) {
		return roleRepository.findById(id).orElse(null);
	}

}
