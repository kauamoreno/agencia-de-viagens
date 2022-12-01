package travel_agency;

public class ClasseDrive {

	public static void main(String[] args) {
		
		StandardClient cliente1 = new StandardClient("Elias Carlos Almada", "533.015.321-28", "Masculino", "29 anos", "(11) 3948-6559", "elias_carlos_almada@riguetti.com.br", 2, "Crédito");
		System.out.println("------------------------------------------------");
		cliente1.imprimirDadosDoUsuario();
		System.out.println();
		cliente1.pacote2();
		
		BlueClient cliente2 = new BlueClient("Cláudia Mariana Sales", "728.308.971-37", "Feminino", "42 anos", "(62) 2532-9124", "claudia-sales74@rafaelsouza.com.br", 2, "Crédito");
		System.out.println();
		System.out.println("------------------------------------------------");
		cliente2.imprimirDadosDoUsuario();
		System.out.println();
		cliente2.pacote3();
		
		MasterClient cliente3 = new MasterClient("Jaqueline Isabella Dias", "316.523.339-08", "Feminino", "37 anos", "(83) 2704-8640", "jaqueline-dias79@isbt.com.br", 3, "Debito");
		System.out.println();
		System.out.println("------------------------------------------------");
		cliente3.imprimirDadosDoUsuario();
		System.out.println();
		cliente3.pacote4();
		
	}
}
