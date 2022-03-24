
public class TestaBanco {

	public static void main(String[] args) {
		Cliente lauro = new Cliente();
		lauro.nome = "Lauro Otávio Urbano";
		lauro.cpf = "041.005.609-01";
		lauro.profissao = "Desenvolvedor Java";
		
		Conta contaDoLauro = new Conta();
		contaDoLauro.deposita(100);
		
		contaDoLauro.titular = lauro;
		System.out.println(contaDoLauro.titular.nome);
	}
}
