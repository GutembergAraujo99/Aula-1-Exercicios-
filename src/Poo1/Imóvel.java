package Poo1;

public class Imóvel {
	private double areaDoImovel;
	private double valorDoImovel;
	
	public void Imovel(double areaDoImovel, double valorDoImovel) {
		super();
		this.areaDoImovel = areaDoImovel;
		this.valorDoImovel = valorDoImovel;
	}
	public double getAreaDoImovel() {
		return areaDoImovel;
	}
	public void setAreaDoImovel(double areaDoImovel) {
		this.areaDoImovel = areaDoImovel;
	}
	public double getValorDoImovel() {
		return valorDoImovel;
	}
	public void setValorDoImovel(double valorDoImovel) {
		this.valorDoImovel = valorDoImovel;
	}
	
	public String toString() {
		return "Area do imovel: " + this.areaDoImovel + "m2\n" 
				+ "Valor do imovel: R$" + this.valorDoImovel; 
	}
	
}

