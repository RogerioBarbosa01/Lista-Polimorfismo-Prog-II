public class Quadrado extends Retangulo {
    private float lado;
    private String nome = "Quadrado";
    
    public Quadrado(float lado) {
        super(lado, lado);
        
        this.lado = lado;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
}