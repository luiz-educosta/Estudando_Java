package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; //final para ficar constante
		double area = PI * raio * raio;
		
		System.out.println("Área 1 = " + area + "m2.");
		
		raio = 10;
		
		area = PI * raio * raio;
		
		System.out.println("Área 2 = " + area + "m2.");
	}
}
