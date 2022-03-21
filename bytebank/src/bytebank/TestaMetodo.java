package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 100;
		
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		boolean conseguiuRetirar = conta1.saca(20);
		System.out.println(conta1.saldo);
		System.out.println(conseguiuRetirar);
	}

}
