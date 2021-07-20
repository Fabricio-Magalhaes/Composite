package composite;

/**
 *
 * @author Fabricio
 */
public class Composite {

    public static void main(String[] args) {
        Adesivos adesivos = new Adesivos();
        Bustos bustos = new Bustos();
        Camisetas camisetas = new Camisetas();
        Canetas canetas = new Canetas();
        Miniaturas miniaturas = new Miniaturas();
        Quadrinhos quadrinhos = new Quadrinhos();
        Posters posters = new Posters();
        Chaveiro chaveiro = new Chaveiro();
        
        CompositLojaGibe contaBronze = new CompositLojaGibe();
        CompositLojaGibe contaPrata = new CompositLojaGibe();
        
        contaBronze.add(chaveiro);
        contaBronze.add(adesivos);
        contaBronze.add(quadrinhos);
        
        contaBronze.print();
        
    }
    
}
