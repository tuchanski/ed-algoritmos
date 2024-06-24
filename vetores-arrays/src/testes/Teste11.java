package testes;

import vetor.VetorGenerico;
import vetor.VetorObject;

public class Teste11 {

    public static void main(String[] args) {
        
        VetorGenerico<String> vetor = new VetorGenerico<String>(2);
        
        try{
            vetor.adicionarElemento("vetor");
            vetor.adicionarElemento("corrigido");
            vetor.adicionarElemento("eee");
            System.out.println(vetor);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
    
}
