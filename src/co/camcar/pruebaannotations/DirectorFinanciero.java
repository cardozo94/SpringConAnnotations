package co.camcar.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	private CreacionInformeFinanciero informeFinanciero;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe del Director financiero "+informeFinanciero.getInformeFinanciero();
	}

}
