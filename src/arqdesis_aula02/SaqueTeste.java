package arqdesis_aula02;


public class SaqueTeste {
	
	public static void main(String args[]){
	
		Saque saque = new Saque(3, 25.00, 1000.00);
		
		saque.createDate();
		saque.efetuarSaque();
		
	}
	

}
