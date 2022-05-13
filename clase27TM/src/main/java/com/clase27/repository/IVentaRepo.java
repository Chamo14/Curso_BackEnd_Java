package com.clase27.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.clase27.entity.Venta;

@Repository
public interface IVentaRepo extends JpaRepository<Venta, Long> {
	@Query(value = "SELECT * from ventas where ventas.id_cliente= :id ", nativeQuery = true)
    public List<Venta> listarPorCliente(@Param("id") long id);
}
