package io.fabric8.quickstarts.camel.model;

public class RequestConsulatarCliente {

	
	    private String userId;
	    private String canalLlamada;
	    private String rut;
	    private String condiciones;
	    public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getCanalLlamada() {
			return canalLlamada;
		}
		public void setCanalLlamada(String canalLlamada) {
			this.canalLlamada = canalLlamada;
		}
		public String getRut() {
			return rut;
		}
		public void setRut(String rut) {
			this.rut = rut;
		}
		public String getCondiciones() {
			return condiciones;
		}
		public void setCondiciones(String condiciones) {
			this.condiciones = condiciones;
		}
		public String getCondicionesExcluyentes() {
			return condicionesExcluyentes;
		}
		public void setCondicionesExcluyentes(String condicionesExcluyentes) {
			this.condicionesExcluyentes = condicionesExcluyentes;
		}
		private String condicionesExcluyentes;
}
