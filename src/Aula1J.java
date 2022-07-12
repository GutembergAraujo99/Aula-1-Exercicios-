
public class Aula1J {
	
	/* 	1 ) Extrato: Na empresa em que trabalhamos, há tabelas com o gasto de 
	 * 	cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar
	 *  o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em 
	 *  fevereiro, 23 mil reais e, em março, 17 mil reais, faça uma classe que 
	 *  calcule e imprima a despesa total no trimestre e a média mensal de gastos.
	 */
	
	public void exibe() {
		
		int valor1 = 15000, valor2 = 23000, valor3 = 17000;
		int total = valor1 + valor2 + valor3;
		int media = total / 3;
		System.out.println("Custo total do trimestre é de: " + total);
		System.out.println("Custo médio mensal é de: " + media);
	}
		
	/*  2 ) Soma: Dado determinado número, vocês devem efetuar a soma de 0 até
		o número informado conforme o nome do método. Par: Apenas a soma de
		números pares. Impar: Apenas a soma de números ímpares.
	*/
		

	/*	3) Remoção de caracteres: Dado um texto, vocês devem remover as
		vogais dele e retornar o texto sem estes caracteres;
	*/
		
		public String executa(String nome) {
			return nome.replaceAll("[aeiou]", "");
		}
		
		/* 4) Primos: Dado um número, verifique e retorne se o número informado é primo.
		*/
		
		public static boolean Primo(int numero) {
			for (int i = 2; 1 < numero; i++) {
				if (numero % i == 0) {
					return false;
				}
			}
			return true;
	}
		
		/*
		 * 5) Apenas 1 e 4: Você deve fazer um método que avalia o array passado e
		 *  diz se ele só contém 1 e 4 :)
		 */
		
		public static boolean apenas14(int [] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 1 && nums[1] != 4) {
					return false;
				}
			}
			return true; 
		}
		
		/* 6) Múltiplos de 10: Dado array, você deve avaliar cada posição. 
		Quando encontrar um múltiplo de 10, você deve substituir os próximos valores por esse múltiplo. 
		Caso encontre outro, o valor deve mudar para este novo múltiplo. 
		Ex: 1, 10, 11, 20, 12 -> 1, 10, 10, 20, 20.
		*/
}

