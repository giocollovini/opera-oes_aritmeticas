
public class Main {

	public static void main(String[] args) {
		
		double b, B, h, area;
				
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println("Valor double: " + area); 
		
		//---------------------------
		
		float c, C, g, total;
		c = 6f;
		C = 8f;
		g = 5f;
		total = (c + C) / 2f * g;
		System.out.println("Valor float: " + total); 
		
		//---------------------------
		
		int d, e;
		double resultado;
		d = 5;
		e = 2;
		resultado = d / e;
		System.out.println(resultado); //deveria dar 2.5 mas devolve 2.0, temos que converter 
		resultado = (double) d / e;
		System.out.println(resultado); //Fiz a conversao (CAST) e o resultado ficou correto 2.5 
		
		
	}

}
