import java.util.Arrays;

/**
 * A classe Disciplina representa a disciplina que os alunos est�o cursando nos
 * laborat�rios de Ci�ncia da Computa��o (LCC�s). Para isso, cont�m 4 notas, o
 * nome da disciplina, n�mero de horas e calcula a m�dia do aluno e se foi
 * aprovado ou n�o.
 * 
 * @author Erick Araken - Matr�cula: 119210561
 *
 */
public class Disciplina {
	/**
	 * String nomeDisciplina guarda o nome da desciplina em curso.
	 */
	private String nomeDisciplina;
	/**
	 * O Array de double notas guarda 4 notas dos alunos.
	 */
	private double[] notas;
	/**
	 * int horas representa a quantidade de horas da disciplina.
	 */
	private int horas;
	/**
	 * double media armazena a media das notas da disciplina.
	 */
	private double media;

	/**
	 * constr�i uma Disciplina a partir do nomeDisciplina e inicializa o array notas
	 * com 4 espa�os
	 * 
	 * @param nomeDisciplina em String representa o nome do laborat�rio.
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
	}

	/**
	 * cadastraHoras adiciona as horas passadas por par�metro.
	 * 
	 * @param horas em inteiro representa o numero de horas.
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	/**
	 * m�todo booleano que calcula se a media est� maior ou igual a 7 para que
	 * esteja aprovado.
	 * 
	 * @return true se a media for maior ou igual a 7.
	 */
	public boolean aprovado() {
		if (this.calculaMedia() >= 7) {
			return true;
		}
		return false;
	}

	/**
	 * calcula a m�dia aritm�tica, dada as 4 notas da disciplina.
	 * 
	 * @return double media com o valor da m�dia
	 */
	private double calculaMedia() {
		double soma = 0;
		int cont = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			cont++;
		}
		this.media = soma / cont;
		return this.media;
	}

	/**
	 * Cadastra as notas, de acordo com a posi�ao inteiro no array notas e valor da
	 * nota em double.
	 * 
	 * @param notas      inteiro que representa qual a posi��o que sera guardada a
	 *                   nota.
	 * @param valorNotas double que representa o valor das notas.
	 */
	public void cadastraNota(int notas, double valorNotas) {
		this.notas[notas - 1] = valorNotas;
	}

	/**
	 * retorna uma String com o nome da disciplina, horas, media formatada com 1
	 * casa decimal e o array de notas.
	 */
	@Override
	public String toString() {
		return nomeDisciplina + " " + horas + " " + String.format("%.1f", media) + " " + Arrays.toString(notas);
	}

}
