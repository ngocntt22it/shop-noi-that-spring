package com.tpanh.server.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.tpanh.server.domain.Role;
import com.tpanh.server.repository.RoleRepository;

public class DataSeeder implements CommandLineRunner {
  @Autowired
  private RoleRepository roleRepository;

  @Override
  public void run(String... args) throws Exception {
    if (roleRepository.count() == 0) {
      Role roleAdmin = new Role();
      roleAdmin.setName("ADMIN");
      roleAdmin.setDescription("Administrator");
      roleRepository.save(roleAdmin);

      Role roleUser = new Role();
      roleUser.setName("USER");
      roleUser.setDescription("User");
      roleRepository.save(roleUser);
    }
  }

}
