package gl.oops.lab2;

public class Pizza {

	private String pizzaSize;
	private String crustType;
	private String pizzaType;
	private String topping;

	public Pizza(String pizzaSize, String crustType, String pizzaType, String topping) {
		super();
		this.pizzaSize = pizzaSize;
		this.crustType = crustType;
		this.pizzaType = pizzaType;
		this.topping = topping;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getCrustType() {
		return crustType;
	}

	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public double getPrice(String pizzaSize, String pizzaType, String topping) {
		final int vegetarianPrice = 20;
		final int nonVegPrice = 25;
		final int veganPrice = 15;
		final int toppingPrice = 1;
		double price = 0;
		if (pizzaType.equalsIgnoreCase("Vegetarian")) {
			switch (pizzaSize) {
			case "Small": {
				price += vegetarianPrice;
				break;
			}
			case "Medium": {
				price += vegetarianPrice * 2;
				break;
			}
			case "Large": {
				price += vegetarianPrice * 3;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + pizzaSize);
			}
		} else if (pizzaType.equalsIgnoreCase("Non-Veg")) {
			switch (pizzaSize) {
			case "Small": {
				price += nonVegPrice;
				break;
			}
			case "Medium": {
				price += nonVegPrice * 2;
				break;
			}
			case "Large": {
				price += nonVegPrice * 3;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + pizzaSize);
			}
		} else if (pizzaType.equalsIgnoreCase("Vegan")) {
			switch (pizzaSize) {
			case "Small": {
				price += veganPrice;
				break;
			}
			case "Medium": {
				price += veganPrice * 2;
				break;
			}
			case "Large": {
				price += veganPrice * 3;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + pizzaSize);
			}
		}

		switch (topping) {
		case "Cheese": {
			price += toppingPrice;
			break;
		}
		case "Mushroom": {
			price += toppingPrice;
			break;
		}
		case "Tomato": {
			price += toppingPrice;
			break;
		}
		case "Jalapeno": {
			price += toppingPrice;
			break;
		}
		case "Spinach": {
			price += toppingPrice;
			break;
		}
		}
		return price;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaSize=" + pizzaSize + ", crustType=" + crustType + ", pizzaType=" + pizzaType + ", topping="
				+ topping + "]";
	}

}
