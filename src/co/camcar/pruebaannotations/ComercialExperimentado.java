package co.camcar.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//2. Agregar anotaciones a las clases
@Component("comercialExperimentado")
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean Id a utilizar
	private CreacionInformeFinanciero informeFinanciero;
	
	//@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	public ComercialExperimentado() {
	}

	/*@Autowired
	public void otroNombre(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial "+informeFinanciero.getInformeFinanciero();
	}
	
	//Ejecución de código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	//Ejecución de código después de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucción");
	}
	
}
