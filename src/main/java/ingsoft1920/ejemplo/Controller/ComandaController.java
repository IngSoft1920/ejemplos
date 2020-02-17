package ingsoft1920.ejemplo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ingsoft1920.ejemplo.Beans.ComandaBean;

@Controller
public class ComandaController {
	@Autowired
	ComandaBean comandaBean;
	
	@GetMapping("/hacerComanda")
	public String showPaginaComandaGet(Model model) {
		
		model.addAttribute("comandaBean", comandaBean);
		return "comanda";
	}
	
	@PostMapping("/anadirItem")
	public String anadirElementoComanda(
			@Valid @RequestParam("platoNuevo") String nuevoPlato
			,Model model) {
		
		if(comandaBean.getCantidades().containsKey(nuevoPlato)) {
			int cant=comandaBean.getCantidades().get(nuevoPlato);
			comandaBean.getCantidades().put(nuevoPlato,cant+1);
		}
		
		model.addAttribute("comandaBean", comandaBean);
		
		
		return "comanda";
	}
	
	@PostMapping("/enviarComanda")
	public String enviarComandaPost(Model model) {
		ComandaBean comandaBean = this.comandaBean;
		
		
		//JSON AND INTERNAL STUFF HERE
		
		for(String item : comandaBean.getCantidades().keySet()) {
			System.out.println(item+" -> "+comandaBean.getCantidades().get(item));
		}
		
		this.comandaBean = new ComandaBean();
		model.addAttribute("comandaBean",this.comandaBean);
		return "comanda";
	}
	
}
