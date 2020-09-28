/**
 * O aluno pode manter contas ("penduras") em várias cantinas da universidade.
 * Para controlar os gastos em uma cantina, os lanches realizados são
 * adicionados à conta de uma determinada cantina. Para cada lanche é dado o
 * número de itens consumidos e o seu valor. Para pagar a conta, deve ser
 * informado um valor maior ou igual ao devido, nunca superior. Por fim eh
 * gerada uma representação textual do nome da cantina, quantidade de itens e o
 * valor devido.
 * 
 * @author Erick - Matrícula: 119210561
 *
 */
public class ContaCantina {
	private String nomeDaCantina;
	private int qtdItens;
	private int valorDevido;
	private int valorTotalDevido;

	/**
	 * Contrói uma conta na cantina a partir do String nomeDaCantina.
	 * 
	 * @param nomeDaCantina String que representa o nome da cantina.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}

	/**
	 * Cadastra os lanches a partir da quantidade em inteiro de itens e seu valor em
	 * inteiro gasto.
	 * 
	 * @param qtdItens      inteiro que guarda a quantidades de itens pedidos
	 * @param valorCentavos inteiro q guarda o valor gasto
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorDevido += valorCentavos;
		this.valorTotalDevido += valorCentavos;
	}

	/**
	 * Paga a conta por meio do valor indicado e descota do valor devido, caso seja
	 * menor ou igual que o valor devido, nunca superior.
	 * 
	 * @param valorCentavos inteiro ue indica o valor a ser pago.
	 */
	public void pagaConta(int valorCentavos) {
		if (this.valorDevido >= valorCentavos) {
			this.valorDevido -= valorCentavos;
		}

	}

	/**
	 * mostra o valor de quanto falta ser pago.
	 * 
	 * @return inteiro do valor devido.
	 */
	public int getFaltaPagar() {
		return this.valorDevido;
	}

	/**
	 * gera uma representação textual do nome da cantina, quantidade de itens e o
	 * valor total devido.
	 */
	@Override
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorTotalDevido;
	}

}
