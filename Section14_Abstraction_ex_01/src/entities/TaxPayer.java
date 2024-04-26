package entities;

public abstract class TaxPayer {
	protected String name;
	protected Double anualIncomes;

	public TaxPayer(String name, Double anualIncomes) {
		super();
		this.name = name;
		this.anualIncomes = anualIncomes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncomes() {
		return anualIncomes;
	}

	public void setAnualIncomes(Double anualIncomes) {
		this.anualIncomes = anualIncomes;
	}

	public abstract Double tax() ;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ": ");
		sb.append("$");
		sb.append(String.format("%.2f", tax()));
		return sb.toString();
	}
}
