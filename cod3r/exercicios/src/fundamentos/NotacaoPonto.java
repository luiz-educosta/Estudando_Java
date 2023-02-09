package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat(" !!!");
		
		System.out.println(s);
		
		
		String x = "Luiz".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "LL")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipo primitivo só tem valor
		int a = 2;
		System.out.println(a);
	}
}
