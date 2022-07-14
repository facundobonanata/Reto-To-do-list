package com.sofka.Software.repositories;

import com.sofka.Software.models.ListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Implementa JpaRepository en lugar de CrudRepository !!Important¡¡¡¡
 * */
@Repository
public interface ListRepository extends JpaRepository<ListModel, Long > {
}
