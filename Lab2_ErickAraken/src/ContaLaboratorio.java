/**
 * A conta de laboratório deve ser responsável por manter o registro da
 * quantidade de espaço utilizado, pelo aluno, em determinado laboratório. Cada
 * laboratório também tem uma COTA própria para delimitar o espaço disponível
 * para uso e um objeto para controle do espaço ocupado.
 * 
 * @author Erick Araken - Matrícula: 119210561
 *
 */

public class ContaLaboratorio {
	/**
	 * String nomeLaboratório define qual o nome do laboratório será utilizado.
	 */
	private String nomeLaboratorio;
	/**
	 * inteiro cota define qual o limite de uso possível de espaço no laboratório.
	 */
	private int cota;
	/**
	 * inteiro espaçoOcupado define quanto de espaço já foi preenchido.
	 */
	private int espacoOcupado;

	/**
	 * Constrói uma conta no laboratório a partir do nome do laboratório somente e
	 * com uma cota fixa já preestabelecida de 2000MB.
	 * 
	 * @param nomeLaboratorio em String representa o nome do laboratório.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}

	/**
	 * Um segundo construtor que constrói uma conta no laboratório a partir do nome
	 * do laboratório e cota.
	 * 
	 * @param nomeLaboratorio em String representa o nome do laboratório.
	 * @param cota            em inteiro representa a cota disponível para uso no
	 *                        laboratório em MB.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.cota = cota;
		this.nomeLaboratorio = nomeLaboratorio;
	}

	/**
	 * consomeEspaço utiliza o espaço disponível na conta do laboratório.
	 * 
	 * @param mbytes em inteiro informa quantos MB serão utilizados.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;
	}

	/**
	 * atingiuCota verifica se atingiu a cota disponível.
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
	 * liberaEspaco libera espaço utilizado pela conta do laboratório.
	 * 
	 * @param mbytes quantidade de mbytes a serem liberados.
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;

	}

	/**
	 * retorna uma String contendo o "nomeLaboratorio espaçoOcupado cota".
	 * 
	 * @return representação textual da ContaLaboratorio.
	 */
	@Override
	public String toString() {
		return nomeLaboratorio + " " + espacoOcupado + "/" + cota;
	}

}
