import java.util.Random;

public class Main {
    public static Forma2D[] formas = new Forma2D[5];
    
    public static void main(String[] args) {
        Random rdm = new Random(System.currentTimeMillis());
            
        for(int i = 0; i < 5; i++) {
            int formaAleatoria = rdm.nextInt(3);
            
            switch(formaAleatoria) {
                case 0:
                    formas[i] = new Retangulo(rdm.nextInt(20), rdm.nextInt(20));
                    break;
                case 1:
                    formas[i] = new Circulo(rdm.nextInt(20));
                    break;
                case 2:
                    formas[i] = new Quadrado(rdm.nextInt(20));
                    break;
            }
        }
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Forma: " + formas[i].getNome());
            System.out.println("Área: " + formas[i].calcularArea());
            System.out.println("Perímetro: " + formas[i].calcularPerimetro() + '\n');
        }
    }
}