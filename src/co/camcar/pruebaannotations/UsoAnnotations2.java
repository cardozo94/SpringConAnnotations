package co.camcar.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//usa la calse de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		/*Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		
		if(antonio==lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(antonio+"\n"+lucia);
		}else {

			System.out.println(" No Apuntan al mismo lugar en memoria");
			System.out.println(antonio+"\n"+lucia);
			
		}*/
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());
		contexto.close();

	}

}
