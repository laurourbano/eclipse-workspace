
public class TestaBanco {

	public static void main(String[] args) {
		Cliente lauro = new Cliente();
		lauro.setNome("Lauro Otávio Urbano");
		lauro.setCpf("041.005.609-01");
		lauro.setProfissao("Desenvolvedor Java");
		
		Conta contaDoLauro = new Conta(-1,-10);
		contaDoLauro.deposita(100);
		
		//System.out.println(contaDoLauro.getTitular();
		System.out.println(contaDoLauro.getSaldo());
	}
}
