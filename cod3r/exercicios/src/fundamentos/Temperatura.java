package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final int AJUSTE = 32; 
		final double FATOR = 5.0/9.0;
		int temp_Fahrenheit = 86;
		double temp_celcius = (temp_Fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A temperatura em ºF é " + temp_Fahrenheit +
				"ºF e a temperatura em ºC é " + temp_celcius + "ºC.");
	}
}
