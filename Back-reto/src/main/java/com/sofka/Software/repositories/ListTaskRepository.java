package com.sofka.Software.repositories;

import com.sofka.Software.models.ListTaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Implementa JpaRepository en lugar de CrudRepository !!Important¡¡¡¡
 * */
@Repository
public interface ListTaskRepository extends JpaRepository<ListTaskModel, Long> {
}
