package david.augusto.luan.entidades;

import david.augusto.luan.interfaces.Fabrica;
import lombok.Getter;

public class Pizzaria implements Fabrica {

	@Getter
	private Fabrica fabrica;

	public Pizzaria(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public Pizza pedirPizza(String tipo) {
		return null;
	}

	@Override
	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return null;
	}

}
