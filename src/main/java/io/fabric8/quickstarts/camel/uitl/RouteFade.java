package io.fabric8.quickstarts.camel.uitl;

import org.apache.camel.Exchange;
import org.apache.camel.model.SetBodyDefinition;
import org.apache.camel.processor.SetBodyProcessor;

import io.fabric8.quickstarts.camel.model.Persona;

public class RouteFade {

	public void traerNuemo(Exchange exchange) {

		Integer a = (Integer) exchange.getProperty("precio");

		a = a + 2000;

		exchange.setProperty("precio", a);

	}

	public void mayorEdad(Exchange exchange) {
			
		String num  = (String) exchange.getProperty("edad");
		
		Integer a = Integer.parseInt(num);
					
		if (a >=18) {
						
			System.out.println("Puede entrar al bar");
									
		}
					
		else {
					
			System.out.println("No puede entrar al bar");
		}
					
		exchange.setProperty("edad", num);
	}
			
	public void Salario(Exchange exchange) {
		
		String salario  = (String) exchange.getProperty("salario");
		
		Double a = Double.parseDouble(salario);
					
		if (a <=400) {
			
			a =  a + (a * 0.1);			
			System.out.println("El salario es :" + a);
									
		}
					
		else {
			
			a = a + (a * 0.02);		
			System.out.println("El salario es: " + a);
		}
					
		exchange.setProperty("salario", salario);
	}
	
	
	public void Resultado(Exchange exchange) {
		
		Persona ResponsePersona = new Persona();
		ResponsePersona.setNombre("Pukis");
		ResponsePersona.setEdad((String) exchange.getProperty("edad"));
		ResponsePersona.setSalario((String) exchange.getProperty("salario"));
		
		exchange.getIn().setBody(ResponsePersona);
		

		
		
		
	}
	
}
	


