// implementa a interface animal
// cria um animal e classifica sua espécie

public class Representante implements Animal {
    private String nomeEspecie, nomeAnimal;
    
    public Representante(String nomeEspecie, String nomeAnimal) {
        this.nomeEspecie = nomeEspecie;
        this.nomeAnimal = nomeAnimal;
    }
    
    @Override
    public String getNomeEspecie() {
        return this.nomeEspecie;
    }
    
    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}