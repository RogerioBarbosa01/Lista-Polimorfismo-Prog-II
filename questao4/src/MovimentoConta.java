public interface MovimentoConta {
    public String getCPFCorrentista();
    // retorna o cpf do correntista cuja conta o movimento será aplicado

    public float getValorMovimento();
    // retorna o valor do movimento (positivo se for crédito e negativo se
    // for débito)
}
