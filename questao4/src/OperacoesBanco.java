public interface OperacoesBanco {
    public Correntista encontraCorrentista(Correntista todosCorrentistas[],
                                           String cpfProcurado);
    // procura no vator todosCorrentistas o correntista cujo cpf é igual ao
    // informado no parâmetro cpfProcurado. Se o encontrar, retorna seu respectivo
    // objeto através do método, caso contrário retorna null
}
