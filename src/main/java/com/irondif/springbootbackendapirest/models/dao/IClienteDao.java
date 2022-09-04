package com.irondif.springbootbackendapirest.models.dao;

import com.irondif.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
