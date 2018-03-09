package programinha;

public class OperadoresUnarios {
	public static void main(String[] args) {
		//incrementos e decrementos ++ e --
		int a = 0; 
		//incrementado depois de atribuir
		int b = a++; 
		//incrementado antes de atribuir
		int c = ++a; 
		//decrementado depois de atribuir
		b = a--;
		//decrementado antes de atribuir
		c = --a;
		//mais e menos unário: + e -
		int x = +3; // x recebe o positivo 3
		x = -x; //x recebe -3, nesse caso
		
		//inversão de bits ~ 
		int u =  ~1; // i = -2 (os bitos foram invertidos)
		
		//complementar booleana: !
		boolean falsidade = !(true); //inverte o valor booleano
		//conversão de tipos:(tipo)
		double d = 1.99;
		int i = (int) d; //converte para  double p/int (perda de precisão)
		
		
	
		
		}
}
