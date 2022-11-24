package co.camcar.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer XML de configuración 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//pedir bean al contenedor
		Empleados antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		//usar el bean
		System.out.println(antonio.getTareas());
		System.out.println(antonio.getInforme());
		
		//cerrar el contexto
		contexto.close();

	}

}
