package vn.spring.guitarshop.service;

import org.springframework.stereotype.Service;

import vn.spring.guitarshop.domain.Role;
import vn.spring.guitarshop.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }
}
