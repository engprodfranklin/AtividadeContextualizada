/**
 * 
 * @Franklin
 * 
 */
public class programacaoObjetos {
	public static void main(String[] args) {

	        int x = 10;
	        int y = 20;
	//Orienta��o - Inst�ncia
	Calcular calcular = new Calcular();

	/*1� M�todo - Soma
	Entrada de Dados */
	calcular.setSoma(x, y);
	//Imprimir o Resultado da Soma
	System.out.println(calcular.getSoma());

	/*2� M�todo - Subtra��o
	Entrada de Dados */
	calcular.setSubtracao(calcular.getSoma(), y);
	//Imprimir o Resultado da Subtra��o
	System.out.println(calcular.getSubtracao());

	/*3� M�todo - Multiplica��o
	Entrada de Dados */
	calcular.setMultiplicacao(calcular.getSubtracao(),y);
	//Imprimir o Resultado da Subtra��o
	System.out.println(calcular.getMultiplicacao());

	/*4� M�todo - Divis�o
	Entrada de Dados */
	calcular.setDivisao(calcular.getMultiplicacao(),y);
	//Imprimir o Resultado da Subtra��o
	System.out.println(calcular.getDivisao());

	}

}
