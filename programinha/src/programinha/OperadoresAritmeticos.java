package programinha;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//multiplicação e divisão: * e /
		int um = 3/2; //divisão de inteiros gera um inteiro
		float umEmeio = (float) 3/2; //ocorre promoção aritmética para float
		double xyz = umEmeio * um; //ocorre promoção aritmética para float
	 //módulo: %
		int resto = 7 % 2; //resto = 1
	
		
		//adição e subtração: + e -
		 long l = 1000 + 4000;
		 double d = 1.0 - 0.01;
		 
		 //concatenação
		 
		 long var = 12345;
		 String str = "O valor de var é" + var;
		 
		 //Na concatenação de Strings, as variáveis ou literais são promovidos a String antes:
		 String strdois = "O valor de var é" + Long.toString(var);
	}

}
