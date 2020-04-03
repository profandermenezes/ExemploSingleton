package singleton;

/*
 *  Classe hipotética de conexão com banco de dados onde será
 *  implementado o padrão Singleton.
 */
public class Conexao {
	
	// Conjunto de atributos da classe
	// ...
	
	/* 
	 * Atributo para referenciar a instancia ativa. Este atributo
	 * precisa ser estático para permitir seu manuseio pelo método
	 * getInstancia, também estático.
	 * 
	 * O modificar estático diz que o atribui (ou método) pode ser
	 * acessado mesmo quando não há uma instância da classe. Como
	 * instancia e getInstancia serão utilizados exatamente para
	 * este fim, caso não fossem estáticos, não haveria um objeto
	 * disponível para permitir seu acesso.
	 */
	private static Conexao instancia;
	
	/*
	 * Para esta implementação definimos o construtor como privado.
	 * O objetivo é restringirmos o acesso a ele, garantindo que
	 * não poderão ser geradas instâncias sempre que o usuário
	 * desejar. Lembrando que um método privado só pode ser invocado
	 * de dentro da própria classe.
	 */
	private Conexao() {
		
	}
	
	/* 
	 * Método público que permitirá o acesso a instância da classe.
	 * Caso ainda não exista uma instância ativa, esta será criada e
	 * retornada. Do contrário, será retornada a já existente. 
	 */
	public static Conexao getInstancia() {
		
		if(instancia == null) {
			// O único local onde o construtor será chamado.
			instancia = new Conexao();
		}
		
		return instancia;
		
	}
	
	// Conjunto de métodos da classe
	// ...

}
