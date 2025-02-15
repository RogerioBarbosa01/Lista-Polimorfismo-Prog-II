public class Especimes implements Ferramentas {
    @Override
    public Animal[] filtraEspecie(Animal[] representantes, String especieFiltrar) {
        Animal[] representantesMesmaEspecie = new Representante[representantes.length];
        
        for(int i = 0; i != representantes.length; i++) {
            if(representantes[i].getNomeEspecie() == especieFiltrar) {
                representantesMesmaEspecie[i] = representantes[i];
            }
        }
        
        return representantesMesmaEspecie;
    }
    
    @Override
    public String[] classificaEspecies(Animal[] completo) {
        String guardarEspecie, especiesEncontradas[] = new String[completo.length];
              
        int k = 0;
        
        for(int i = 0; i < completo.length; i++) {
            boolean encontrada = false;
        	
        	guardarEspecie = completo[i].getNomeEspecie();
        	
        	for(int j = 0; j < especiesEncontradas.length; j++) {
        		if(guardarEspecie == especiesEncontradas[j]) 
        			encontrada = true;        			
        	}
        	
        	if(!encontrada) {
        		especiesEncontradas[k] = guardarEspecie;
        		k++;        		
        	}
        }
        
        return especiesEncontradas;
    }
}
