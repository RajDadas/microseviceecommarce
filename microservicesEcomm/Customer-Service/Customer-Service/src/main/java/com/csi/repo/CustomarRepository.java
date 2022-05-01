package com.csi.repo;


import com.csi.model.Customar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomarRepository extends JpaRepository<Customar,Integer> {

    public Customar findByCustId(int custId);
}
