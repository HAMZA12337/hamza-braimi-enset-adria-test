package org.sid.Braimi.repository;

import org.sid.Braimi.entities.Client;
import org.sid.Braimi.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {










}
