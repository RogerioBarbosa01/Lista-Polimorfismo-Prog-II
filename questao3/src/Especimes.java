// implementa a interface ferramentas
// pega exemplos de animais e classifica suas espécies + busca espécie requerida

import java.util.ArrayList;

public class Especimes implements Ferramentas {
    @Override
    public Animal[] filtraEspecie(Animal[] representantes, String especieFiltrar) {
        ArrayList<Animal> representantesMesmaEspecie = new ArrayList<>();
        
        for(Animal a : representantes) {
            if(a.getNomeEspecie() == especieFiltrar) {
                representantesMesmaEspecie.add(a);
            }
        }
        
        return representantesMesmaEspecie.toArray(new Animal[0]);
    }
    
    @Override
    public String[] classificaEspecies(Animal[] completo) {
        // recebe como parâmetro um vetor com animais e retorna um vetor de strings
        // contendo o nome de todasas espécies que foram encontradas no vetor
        // recebido como parâmetro. Cada nome de espécie só aparece uma vez no vetor

        String guardarEspecie;
        ArrayList<String> especiesEncontradas = new ArrayList<>();
        
        for(int i = 0; i < completo.length; i++) {
            boolean encontrada = false;
        	
        	guardarEspecie = completo[i].getNomeEspecie();
        	
        	for(String e : especiesEncontradas) {
        		if(guardarEspecie == e) 
        			encontrada = true;        			
        	}
        	
        	if(!encontrada) {
        		especiesEncontradas.add(guardarEspecie);
        	}
        }
        
        return especiesEncontradas.toArray(new String[0]);
    }
}
