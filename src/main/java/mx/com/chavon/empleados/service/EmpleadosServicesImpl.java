package mx.com.chavon.empleados.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;


@Service
public class EmpleadosServicesImpl implements EmpleadosServices {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<?> getEmpleados() {
		TypedQuery<Tuple> query = em.createQuery("SELECT e.idEmpleado as idEmpleado, "
				+ "e.nombre as nombre, "
				+ "e.apellidoPaterno as apellidoPaterno, "
				+ "e.edad as edad, "
				+ "e.fechaActualizacion as fechaActualizacion "
				+ "FROM empleado e WHERE e.nombre = 'SALVADOR ANTONIO' ", Tuple.class);
		List<Tuple> resultList = query.getResultList();
		return resultList;
	}
	
	@Override
	public List<?> getEmpleadosQuery() {
		Query query = em.createQuery("SELECT e.idEmpleado as idEmpleado, "
				+ "e.nombre as nombre, "
				+ "e.apellidoPaterno as apellidoPaterno, "
				+ "e.edad as edad, "
				+ "e.fechaActualizacion as fechaActualizacion "
				+ "FROM empleado e");
		List resultList = query.getResultList();
		return resultList;
	}

}
