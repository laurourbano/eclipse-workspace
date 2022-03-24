package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaRenata = new Conta();
		contaDaRenata.saldo = 100;
		
		contaDaRenata.deposita(50);
		System.out.println("conta da Renata tem: " + contaDaRenata.saldo);
		
		boolean conseguiuRetirar = contaDaRenata.saca(20);
		System.out.println("conta da Renata tem: " + contaDaRenata.saldo);
		
		Conta contaDoLauro = new Conta();
		contaDoLauro.deposita(1000);
		System.out.println("conta do Lauro tem: " + contaDoLauro.saldo);
	
		if(contaDoLauro.transfere(1001, contaDaRenata)) {
			System.out.println("Transfer�ncia realizada com sucesso!");
		} else {
			System.out.println("N�o havia saldo suficiente para realizar a transa��o, seu saldo �: " 
		+  contaDoLauro.saldo);
		}
		System.out.println("conta do Lauro tem: " + contaDoLauro.saldo);
		System.out.println("conta da Renata tem: " + contaDaRenata.saldo);

		contaDoLauro.titular = "Lauro Ot�vio Urbano";
		System.out.println(contaDoLauro.titular);
		contaDaRenata.titular = "Renata Alyne de Carvalho";
		System.out.println(contaDaRenata.titular);
	}
	

}
