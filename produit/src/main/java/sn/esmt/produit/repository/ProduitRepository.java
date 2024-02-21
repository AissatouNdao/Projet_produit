package sn.esmt.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.esmt.produit.entity.ProduitEntity;

import java.util.Optional;

@Repository

public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {

  @Query("select p from ProduitEntity p where p.ref=?1 and p.qteStock=?2")
  public Optional<ProduitEntity> findByReferenceAndQtStock(String ref, double qtStock);


  public Optional <ProduitEntity> findByRef(String ref);
}