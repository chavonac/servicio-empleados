package mx.com.chavon.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@EntityScan({ "mx.com.chavon.entities.entidades" })
public class ServicioEmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEmpleadosApplication.class, args);
	}

}
