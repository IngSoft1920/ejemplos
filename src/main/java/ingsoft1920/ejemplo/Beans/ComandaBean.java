package ingsoft1920.ejemplo.Beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ComandaBean {
	ArrayList<String> listaPlatos;
	Map<String, Integer> cantidades;
	
	String platoNuevo;
	int cantidadNueva;
	
	public ComandaBean() {
		this.listaPlatos=new ArrayList<String>();
		this.listaPlatos.add("lentejas");
		this.listaPlatos.add("potaje");
		this.cantidades=new HashMap<String, Integer>();
		for(String plato : listaPlatos) {
			this.cantidades.put(plato, 0);
		}
	}
	
	public String getPlatoNuevo() {
		return this.platoNuevo;
	}
	
	public void setPlatoNuevo(String platoNuevo) {
		this.platoNuevo= platoNuevo;
	}
	
	public int getCantidadNueva() {
		return this.cantidadNueva;
	}
	
	public void setCantidadNueva(int cantidadNueva) {
		this.cantidadNueva=cantidadNueva;
	}
	
	public Map<String, Integer> getCantidades(){
		return this.cantidades;
	}
	

}
