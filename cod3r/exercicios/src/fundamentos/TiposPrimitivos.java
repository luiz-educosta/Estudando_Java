package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23; 				// 1 byte
		short numeroDeVoos = 542;				// 2 bytes
		int id = 56789;							// 4 bytes usado por padrão
		long pontosAcumulados = 3_134_845_223L; // 8 bytes
		
		// Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01; // usado por padrão
		
		// Tipo booleano
		
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
