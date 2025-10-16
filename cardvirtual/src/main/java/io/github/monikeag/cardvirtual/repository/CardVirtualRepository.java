package io.github.monikeag.cardvirtual.repository;


import io.github.monikeag.cardvirtual.model.CardVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardVirtualRepository extends JpaRepository<CardVirtual, Long> {
    //Save > FindAll > FindById

}
