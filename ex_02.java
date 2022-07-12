import java.util.Scanner;
public class ex_02 {
	
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

	public static void main(String[] args) {
		float maior=0, menor=999999, indiceMedia = 0, mediaAbaixo5k = 0;
		int codMaior = 0, codMenor = 0;
		int x = 0;
		do {
			int cod = scanInt("Digite o codigo da cidade: ");
			int nVeiculosPasseio = scanInt("Digite o numero de veiculos de passeio: ");
			int nAcidentes = scanInt("Digite o numero de veiculos de passeio: ");
			float indice = nVeiculosPasseio/nAcidentes;
			if(maior<indice) {
				maior = indice;
				codMaior = cod;				
			}
			if(menor>indice) {
				menor = indice;
				codMenor = cod;				
			}
			indiceMedia += indice;
			if(nVeiculosPasseio>5000)
				mediaAbaixo5k += indice;
			x++;
		}while(5>x);

		print("Media abaixo de 5k: "+(mediaAbaixo5k/5));
		print("Media: "+(indiceMedia/5));
		print("Cod do maior: "+(codMaior));
		print("Cod do menor: "+(codMenor));
		
	}

}
