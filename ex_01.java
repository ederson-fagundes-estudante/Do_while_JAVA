import java.util.Scanner;
public class ex_01 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}

	public static String scan(String text) {
		print(text);
		return sc.next();
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static int scanInt(String text) {
		print(text);
		return sc.nextInt();
	}

	public static boolean ÈPrimo(float n) {
		if(n<0)	return false;
		int x = 1, div = 0;
		do {
			if(n%x==0) div++;
			x++;
		}while(x<=n);
		if(div==2)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		float valor = scanFloat("Digite o valor: ");
		if(ÈPrimo(valor))
			print("… primo");
		else
			print("N„o È primo");
		
	}

}
