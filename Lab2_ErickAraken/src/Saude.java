/**
 * Todo aluno tem uma saúde física e mental. Cada uma delas pode estar boa ou
 * fraca. Caso ambas estejam fracas, a saúde geral do aluno é “fraca”. Se ambas
 * estiverem boas, a saúde geral do aluno é “boa”. Se uma delas estiver fraca,
 * mas a outra estiver boa, a saúde geral do aluno é considerada “ok”.
 * 
 * @author Erick - Matrícula: 119210561
 *
 */
public class Saude {
	private String saudeMental;
	private String saudeFisica;
	private String Status;

	/**
	 * Constrói a Saúde mental e física do aluno, definindo como boa a princípio.
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}

	/**
	 * Define a saúde mental, "boa" ou "fraca", do aluno a partir do String valor.
	 * 
	 * @param valor String que indica a saúde mental do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;

	}

	/**
	 * Define a saúde física, "boa" ou "fraca", do aluno a partir do String valor.
	 * 
	 * @param valor String que indica a saúde mental do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;

	}

	/**
	 * Obtém o Satus Geral da Saúde física e mental do aluno.
	 * 
	 * @return String Status com o valor da Saúde Geral do aluno.
	 */
	public String getStatusGeral() {
		if (this.saudeFisica.equals("boa")) {
			if (this.saudeMental.equals("boa")) {
				this.Status = "boa";
			} else {
				this.Status = "ok";
			}
		}

		if (this.saudeFisica.equals("fraca")) {
			if (this.saudeMental.equals("fraca")) {
				this.Status = "fraca";
			} else {
				this.Status = "ok";
			}
		}
		return this.Status;
	}
}
