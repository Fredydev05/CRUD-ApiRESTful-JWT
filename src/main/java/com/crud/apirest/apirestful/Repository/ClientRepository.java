package com.crud.apirest.apirestful.Repository;

import com.crud.apirest.apirestful.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
