package programinha;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//multiplica��o e divis�o: * e /
		int um = 3/2; //divis�o de inteiros gera um inteiro
		float umEmeio = (float) 3/2; //ocorre promo��o aritm�tica para float
		double xyz = umEmeio * um; //ocorre promo��o aritm�tica para float
	 //m�dulo: %
		int resto = 7 % 2; //resto = 1
	
		
		//adi��o e subtra��o: + e -
		 long l = 1000 + 4000;
		 double d = 1.0 - 0.01;
		 
		 //concatena��o
		 
		 long var = 12345;
		 String str = "O valor de var �" + var;
		 
		 //Na concatena��o de Strings, as vari�veis ou literais s�o promovidos a String antes:
		 String strdois = "O valor de var �" + Long.toString(var);
	}

}
