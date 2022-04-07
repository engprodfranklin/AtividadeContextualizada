/**
 * 
 * @Franklin
 * 
 */
public class programacaoObjetos {
	public static void main(String[] args) {

	        int x = 10;
	        int y = 20;
	//Orientação - Instância
	Calcular calcular = new Calcular();

	/*1º Método - Soma
	Entrada de Dados */
	calcular.setSoma(x, y);
	//Imprimir o Resultado da Soma
	System.out.println(calcular.getSoma());

	/*2º Método - Subtração
	Entrada de Dados */
	calcular.setSubtracao(calcular.getSoma(), y);
	//Imprimir o Resultado da Subtração
	System.out.println(calcular.getSubtracao());

	/*3º Método - Multiplicação
	Entrada de Dados */
	calcular.setMultiplicacao(calcular.getSubtracao(),y);
	//Imprimir o Resultado da Subtração
	System.out.println(calcular.getMultiplicacao());

	/*4º Método - Divisão
	Entrada de Dados */
	calcular.setDivisao(calcular.getMultiplicacao(),y);
	//Imprimir o Resultado da Subtração
	System.out.println(calcular.getDivisao());

	}

}
