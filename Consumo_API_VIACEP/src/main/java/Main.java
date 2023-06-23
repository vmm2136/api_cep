import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("Informe o CEP que deseja consultar (apenas números!)");
		Scanner sc = new Scanner(System.in);
		String cep = sc.nextLine();
		
		Endereco endereco = new Endereco();
		endereco = ServicoDeCep.buscaEnderecoPelo(cep);
		
		System.out.println(endereco.toString());
		
	}

}
