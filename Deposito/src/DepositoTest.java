import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DepositoTest {

	@CsvSource({
		"01,-1,11",
		"02,0,01",
		"03,1,10"
	})
	@ParameterizedTest
	void testDeposito(float valor_diametro, float valor_altura, String valor_idDeposito) {
	
		Deposito deposito=new Deposito( valor_diametro,  valor_altura,  valor_idDeposito);
		
	float alturaEsperado=valor_altura;
	float alturaResultado=deposito.getAltura();
	
	assertEquals(alturaEsperado,"error");


	}
	@Test
	void testGetDiametro() {
		
		Deposito deposito = new Deposito();
		
		float esperado=deposito.getDiametro();
		
		float resultado=-1;
		
		assertEquals(esperado,resultado,"error");
	}

	@Test
	void testSetValoresDiametro(String valor_idDeposito, float valor_diametro, float valor_altura) {
		
		Deposito deposito = new Deposito();

		String idEsperado=deposito.getIdDeposito();
		float diametroEsperado=deposito.getDiametro();
		float alturaEsperada=deposito.getAltura();
		
		String idResultado="1";
		float diametroResultado=-1;
		float alturaResultado=-1;
		
		assertEquals(idEsperado,idResultado,"error");
		assertEquals(diametroEsperado,diametroResultado,"error");
		assertEquals(alturaEsperada,alturaResultado,"error");

		
	}
}
