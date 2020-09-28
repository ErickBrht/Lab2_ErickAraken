/**
 * Todo aluno tem uma sa�de f�sica e mental. Cada uma delas pode estar boa ou
 * fraca. Caso ambas estejam fracas, a sa�de geral do aluno � �fraca�. Se ambas
 * estiverem boas, a sa�de geral do aluno � �boa�. Se uma delas estiver fraca,
 * mas a outra estiver boa, a sa�de geral do aluno � considerada �ok�.
 * 
 * @author Erick - Matr�cula: 119210561
 *
 */
public class Saude {
	private String saudeMental;
	private String saudeFisica;
	private String Status;

	/**
	 * Constr�i a Sa�de mental e f�sica do aluno, definindo como boa a princ�pio.
	 */
	public Saude() {
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}

	/**
	 * Define a sa�de mental, "boa" ou "fraca", do aluno a partir do String valor.
	 * 
	 * @param valor String que indica a sa�de mental do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;

	}

	/**
	 * Define a sa�de f�sica, "boa" ou "fraca", do aluno a partir do String valor.
	 * 
	 * @param valor String que indica a sa�de mental do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;

	}

	/**
	 * Obt�m o Satus Geral da Sa�de f�sica e mental do aluno.
	 * 
	 * @return String Status com o valor da Sa�de Geral do aluno.
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
