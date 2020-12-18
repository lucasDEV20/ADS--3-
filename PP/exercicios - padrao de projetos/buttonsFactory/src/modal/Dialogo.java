/*
____________________________________________________________________________________________________________

-Autor > Lucas Araujo (LucasDEV20)
=Disciplina > Padores de projetos
-Fonte para relaizar tal estudo > https://refactoring.guru/pt-br/design-patterns/factory-method/java/example
- Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de 
classes concretas, mas os retornam como objetos de tipo ou interface abstrata.
____________________________________________________________________________________________________________
 */
package modal;

/**
 *
 * @author lucasDEV20
 * 
 * Classe básica de fábrica. Observe que "fábrica" ​​é apenas uma função para a classe. isto
 * deve ter alguma lógica de negócios central que precisa de produtos diferentes para ser
 * criada.
 * 
 * 
 * 
 *  A fabrica  caixa de diálogo HTML produzirá botões HTML.
 */
public abstract class Dialogo {
    public void JanelaDeRederinzacao() {
        // ... outro codigo ...

        Botao okBotao = criarButao();
        okBotao.entrega();
    }

    /**
     * As subclasses irão sobrescrever este método para criar um botão específico
     * objetos.
     */
    public abstract Botao criarButao();
    
}
