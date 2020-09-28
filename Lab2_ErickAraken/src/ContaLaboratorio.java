/**
 * A conta de laborat�rio deve ser respons�vel por manter o registro da
 * quantidade de espa�o utilizado, pelo aluno, em determinado laborat�rio. Cada
 * laborat�rio tamb�m tem uma COTA pr�pria para delimitar o espa�o dispon�vel
 * para uso e um objeto para controle do espa�o ocupado.
 * 
 * @author Erick Araken - Matr�cula: 119210561
 *
 */

public class ContaLaboratorio {
	/**
	 * String nomeLaborat�rio define qual o nome do laborat�rio ser� utilizado.
	 */
	private String nomeLaboratorio;
	/**
	 * inteiro cota define qual o limite de uso poss�vel de espa�o no laborat�rio.
	 */
	private int cota;
	/**
	 * inteiro espa�oOcupado define quanto de espa�o j� foi preenchido.
	 */
	private int espacoOcupado;

	/**
	 * Constr�i uma conta no laborat�rio a partir do nome do laborat�rio somente e
	 * com uma cota fixa j� preestabelecida de 2000MB.
	 * 
	 * @param nomeLaboratorio em String representa o nome do laborat�rio.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}

	/**
	 * Um segundo construtor que constr�i uma conta no laborat�rio a partir do nome
	 * do laborat�rio e cota.
	 * 
	 * @param nomeLaboratorio em String representa o nome do laborat�rio.
	 * @param cota            em inteiro representa a cota dispon�vel para uso no
	 *                        laborat�rio em MB.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.cota = cota;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	/**
	 * consomeEspa�o utiliza o espa�o dispon�vel na conta do laborat�rio.
	 * 
	 * @param mbytes em inteiro informa quantos MB ser�o utilizados.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
	}

	/**
	 * atingiuCota verifica se atingiu a cota dispon�vel.
	 * 
	 * @return atingiuCota como boolean se atingiu a cota.
	 */
	public boolean atingiuCota() {
		boolean atingiuCota = false;
		if (this.espacoOcupado >= this.cota) {
			atingiuCota = true;
		}
		return atingiuCota;
	}

	/**
	 * liberaEspaco libera espa�o utilizado pela conta do laborat�rio.
	 * 
	 * @param mbytes quantidade de mbytes a serem liberados.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;

	}

	/**
	 * retorna uma String contendo o "nomeLaboratorio espa�oOcupado cota".
	 * 
	 * @return representa��o textual da ContaLaboratorio.
	 */
	@Override
	public String toString() {
		return nomeLaboratorio + " " + espacoOcupado + "/" + cota;
	}

}
