public class Movimento implements MovimentoConta {
    private String cpfCorrentista;
    private float valorMovimento;
    
    @Override
    public String getCPFCorrentista() {
        return this.cpfCorrentista;
    }
    
    @Override
    public float getValorMovimento() {
        return this.valorMovimento;
    }
}