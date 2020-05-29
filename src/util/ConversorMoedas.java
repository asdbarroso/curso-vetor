package util;

public class ConversorMoedas {
	public static final double IOF = 0.06;
	public static double valor;
	
	public static double converteDolarReais(double quantidade) {
		return (quantidade * valor) + (quantidade * valor * IOF);
	}
}
