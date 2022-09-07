package com.irondif.springbootbackendapirest.models.dao;

import com.irondif.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
