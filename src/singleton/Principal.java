package singleton;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * O modelo tradicional de instanciaçao não é possível
		 * aqui devido ao construtor ser privado.
		 */
		//Conexao conexao = new Conexao();
		
		/*
		 * Para utilizarmos um objeto do tipo Conexao precisamos
		 * invocar o método estático getInstancia. Fazemos isso
		 * diretamente a partir da própria classe, da seguinte 
		 * forma: 
		 */
		Conexao conexao = Conexao.getInstancia();
		
		/*
		 * Com essa implementação temos a certeza de que não teremos
		 * mais que uma instância da mesma classe, mesmo que o método
		 * seja invocado novamente. Façam o teste mudando o construtor
		 * para público e fazendo a instanciação da conexao2 da forma
		 * tradicional.
		 */
		Conexao conexao2 = Conexao.getInstancia();
		
		if(conexao == conexao2) {
			System.out.println("As conexões são iguais!");
		} else {
			System.out.println("As conexões não são iguais!");
		}

	}

}
