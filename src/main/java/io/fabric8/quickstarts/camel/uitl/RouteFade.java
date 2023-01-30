package io.fabric8.quickstarts.camel.uitl;

import org.apache.camel.Exchange;
import org.apache.camel.model.SetBodyDefinition;
import org.apache.camel.processor.SetBodyProcessor;

import io.fabric8.quickstarts.camel.model.Persona;
import io.fabric8.quickstarts.camel.model.Response_numero;
import io.fabric8.quickstarts.camel.model.numeros;

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
	
	public void resultadoOperacion (Exchange exchange) {
		
		Response_numero responseNumero = new Response_numero();
		
		String tipoOperacion = (String) exchange.getProperty("operacion"); 
		
		
		String numero1  = (String) exchange.getProperty("num1");
		Double a = Double.parseDouble(numero1);
		
		String numero2  = (String) exchange.getProperty("num2");
		Double b = Double.parseDouble(numero2);
		
		Double resultado;
		
		if (tipoOperacion.contains("suma")) {
			resultado = a + b;
			responseNumero.setResultado(resultado);
		}
		
		if (tipoOperacion.contains("resta")) {
			resultado = a - b;
			responseNumero.setResultado(resultado);
		
		}
		
		if (tipoOperacion.contains("multiplicacion")) {
			resultado = a * b;
			responseNumero.setResultado(resultado);
		
		}
		
		if (tipoOperacion.contains("division")) {
			resultado = a / b;
			responseNumero.setResultado(resultado);
		
		}
		
		exchange.getIn().setBody(responseNumero);
	}
	
}
	


