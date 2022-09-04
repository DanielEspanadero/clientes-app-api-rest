package com.irondif.springbootbackendapirest.models.services;

import com.irondif.springbootbackendapirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

}
