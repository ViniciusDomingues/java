package programinha;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 1.99d;
		int i = (int) d; // i recebe o valor 1
		
		short s = 15;
		long x = s; //convers�o widening
		long y = (long) s; // n�o � necess�rio
	}

}
