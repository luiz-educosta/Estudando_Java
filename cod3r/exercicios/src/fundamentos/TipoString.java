package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola pessoal!".charAt(2));
		
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + " !!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toUpperCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// uma maneira
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade
				+ "\nSalario" + salario + "\n\n");
		
		// outra maneira mais convencional
		//System.out.println("O Senhor %s %s tem %d anos e ganha R$%.2f.",
		//		nome, sobrenome, idade, salario);
		
		System.out.println("Nome %s", nome);
				
	}
	
}
