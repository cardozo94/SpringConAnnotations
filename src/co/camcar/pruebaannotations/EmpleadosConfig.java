package co.camcar.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("co.camcar.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//definir el bean para informe financiero dto compras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}
	
	//definir el bean para el director fiannaciero e inyectar dependencias

	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
