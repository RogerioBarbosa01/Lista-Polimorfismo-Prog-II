public interface Ferramentas {
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
    // recebe um vetor contendo animais, que podem ser de várias espécies, e
    // retorna um vator contendo apenas os animais cuja espécie é especificada
    // no parâmetro "especieFiltrar". Se não houver nenhum animal da espécie
    // especificada, retorna um vetor com zero posições

    public String[] classificaEspecies(Animal[] completo);
    // recebe um vetor contendo animais e retorna um vetor de strings contendo
    // o nome de todas as espécies que foram encontradas no vetor recebido como
    // parâmetro. Cada nome de espécie só apaece uma vez no vetor de saída
}
