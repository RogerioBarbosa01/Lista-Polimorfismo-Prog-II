public class Operacoes implements OperacoesBanco {
    
    @Override
    public Correntista encontraCorrentista(Correntista todosCorrentistas[],
                                           String cpfProcurado) {
        for(Correntista c : todosCorrentistas) {
            if(c.getCpfCliente() == cpfProcurado) {
                return c;
            }
        }

        return null;
    }
}