public class Retangulo extends Forma2D {
    private float lado, altura;
    private String nome = "Retângulo";
    
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }
    
    @Override
    public float calcularPerimetro() {
        return 2*this.lado + 2*this.altura;
    }
}