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
 */
public class WindowsTelaDialog extends Dialogo{
     @Override
    public Botao criarButao() {
        return new butaoWindows();
    }
}
