package ingsoft1920.ejemplo.Beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EjemploContadorTests {

	@Test
	public void testSumarUno() {
		EjemploContadorBean contador = new EjemploContadorBean();
		int previo=contador.getContadorVisitas();
		contador.addOne();
		Assertions.assertEquals(previo+1,contador.getContadorVisitas());		
	}
}
