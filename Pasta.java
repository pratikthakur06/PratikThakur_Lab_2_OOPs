package gl.oops.lab2;

public class Pasta {

	private String sauce;
	private String pastaType;

	public Pasta(String sauce, String pastaType) {
		super();
		this.sauce = sauce;
		this.pastaType = pastaType;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getPastaType() {
		return pastaType;
	}

	public void setPastaType(String pastaType) {
		this.pastaType = pastaType;
	}

	public double getPrice(String sauce) {
		double price = 0;
		if (sauce.equalsIgnoreCase("White")) {
			price += 10;
		} else if (sauce.equalsIgnoreCase("Red")) {
			price += 20;
		}
		return price;
	}

	@Override
	public String toString() {
		return "Pasta [sauce=" + sauce + ", pastaType=" + pastaType + "]";
	}

}
