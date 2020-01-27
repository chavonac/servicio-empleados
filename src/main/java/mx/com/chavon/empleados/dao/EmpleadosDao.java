package mx.com.chavon.empleados.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import mx.com.chavon.entities.entidades.empleado;

public interface EmpleadosDao extends CrudRepository<empleado, BigDecimal>{

}
