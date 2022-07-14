package com.sofka.Software.repositories;

import com.sofka.Software.models.ListModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * Implementa JpaRepository en lugar de CrudRepository !!Important¡¡¡¡
 * */
public interface ListRepository extends JpaRepository<ListModel, Long > {
}
