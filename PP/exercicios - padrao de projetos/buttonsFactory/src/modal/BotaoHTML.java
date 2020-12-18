package modal;


import modal.Botao;

/*
___________________________________________________________________________________________________________
-Autor > Lucas Araujo (LucasDEV20)
=Disciplina > Padores de projetos
-Fonte para relaizar tal estudo > https://refactoring.guru/pt-br/design-patterns/factory-method/java/example
- Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de 
classes concretas, mas os retornam como objetos de tipo ou interface abstrata.
____________________________________________________________________________________________________________
 */

/**
 *
 * @author lucasDEV20
 * implementaçao de butao HTML
 */
public class BotaoHTML implements Botao{

    
    @Override
    public void entrega() {
         System.out.println("<button>Test Button</button>");
        entrega();
    }

    @Override
    public void AoClicar() {
        System.out.println("Clique!\n"
                         +  " O botao diz - 'Ola Professor Eugenio!'\n"
                         + "Boa tarde e boas festas!");
        AoClicar();
    }
    
}
