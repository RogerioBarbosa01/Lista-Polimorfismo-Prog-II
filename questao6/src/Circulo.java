public class Circulo extends Forma2D {
    private float raio;
    private String nome = "Círculo";
    
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public float calcularArea() {
        return (float)Math.PI * this.raio * this.raio;
    }
    
    @Override
    public float calcularPerimetro() {
        return 2 * (float)Math.PI * this.raio;
    }
}