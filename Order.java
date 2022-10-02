package gl.oops.lab2;

import java.util.List;

public class Order {

	private List<Pizza> pizzas;
	private List<Pasta> pastas;
	
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	public List<Pasta> getPastas() {
		return pastas;
	}
	public void setPastas(List<Pasta> pastas) {
		this.pastas = pastas;
	}
	
	@Override
	public String toString() {
		return "Order [pizzas=" + pizzas + ", pastas=" + pastas + "]";
	}
	public void displayOrders() {
		System.out.println(getPizzas().toString());
		System.out.println(getPastas().toString());
	}
}
