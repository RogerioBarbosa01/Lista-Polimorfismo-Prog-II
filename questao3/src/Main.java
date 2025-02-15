import java.util.ArrayList;

public class Main {
	public static Resultado[] contaAnimaisEmCadaEspecie(Animal[] a, Ferramentas f) {
		int i, j;

		ArrayList<Resultado> resultados = new ArrayList<>();
		// Cada objeto conterá uma espécie e o
		// número de animais da mesma contabilizados. Devem ser consideradas apenas as
		// espécies cujos animais estão presentes no vetor.

		// vetor com os nomes das espécies
		String[] especies = f.classificaEspecies(a);

		Animal[][] tiposDeEspecies = new Animal[especies.length][];

		for(i = 0; i < especies.length; i++) {
			tiposDeEspecies[i] = f.filtraEspecie(a, especies[i]);
		} // filtrando as espécies e guardando os seus valores

		for(i = 0; i < tiposDeEspecies.length; i++) { // usar nome (especies) e quantidade (tipos de especies)
			for(j = 0; j < tiposDeEspecies[i].length; j++);

			// nome da espécie e quantidade de animais daquela espécie

			resultados.add(new Resultado(especies[i], j));
		}
		
		// transformando arraylist em vetor e retornando
		return resultados.toArray(new Resultado[0]);
	}
	
    public static void main(String args[]) {
		Ferramentas especimes = new Especimes();

		Animal tubarao = new Representante("Peixe", "Tubarão");
		Animal baiacu = new Representante("Peixe", "Baiacu");
		Animal salmao = new Representante("Peixe", "Salmão");

		Animal sapo = new Representante("Anfíbio", "Sapo");
		Animal salamandra = new Representante("Anfíbio", "Salamandra");

		Animal jacare = new Representante("Réptil", "Jacaré");
		Animal jabuti = new Representante("Réptil", "Jabuti");

		Animal aguia = new Representante("Ave", "Águia");
		Animal papagaio = new Representante("Ave", "Papagaio");
		Animal pinguim = new Representante("Ave", "Pinguim");

		Animal baleia = new Representante("Mamífero", "Baleia");
		Animal golfinho = new Representante("Mamífero", "Golfinho");
		Animal humano = new Representante("Mamífero", "Humano");
    	Animal cachorro = new Representante("Mamífero", "Cachorro");
		Animal gato = new Representante("Mamífero", "Gato");

		// vetor contendo todos os animais
		Animal[] animais = {tubarao, 
							baiacu, 
							salmao, 
							sapo, 
							salamandra, 
							jacare, 
							jabuti, 
							aguia, 
							papagaio,
							pinguim,
							baleia,
							golfinho,
							humano,
							cachorro,
							gato};

		Resultado[] resultado = contaAnimaisEmCadaEspecie(animais, especimes);
		
		for(Resultado r : resultado) {
			System.err.println("Espécie: " + r.getNomeEspecie());
			System.err.println("Quantidade de animais: " + r.getQuantidade() + "\n");
		}
    }
}
