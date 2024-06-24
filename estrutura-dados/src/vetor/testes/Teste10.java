package testes;

import models.VetorObject;

public class Teste10 {

    public static void main(String[] args) {
        
        VetorObject vetor = new VetorObject(2);
        
        try{

            vetor.adicionarElemento(1);
            vetor.adicionarElemento("vetor");
            vetor.adicionarElemento(new Usuario("Joaquim", "jo@gmail.com", "123-456"));
            
            System.out.println(vetor);

            // Elementos do vetor tem que ser do mesmo tipo!
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
    
}
