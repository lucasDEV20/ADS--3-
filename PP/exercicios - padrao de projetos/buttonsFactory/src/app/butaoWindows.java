/*
 ___________________________________________________________________________________________________________

-Autor > Lucas Araujo (LucasDEV20)
=Disciplina > Padores de projetos
-Fonte para relaizar tal estudo > https://refactoring.guru/pt-br/design-patterns/factory-method/java/example
- Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de 
classes concretas, mas os retornam como objetos de tipo ou interface abstrata.
____________________________________________________________________________________________________________
 */
package app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import modal.Botao;

/**
 *
 * @author lucasDEV20
 * 
Implementação do botão do Windows.
 */
public class butaoWindows implements Botao {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton botao;

    @Override
    public void entrega() {
        //CHAMANDO OS COMPONENTES DA TELA 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Ola mundo!\n");
        
        
        
        //A biblioteca JLabel cria um novo obojeto 
        //e depois chama cada componente e imcorpora os opjetos
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        //cor do fundo
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        AoClicar();
        panel.add(botao);

        frame.setSize(320, 200);
        frame.setVisible(true);
        AoClicar();
        
        
       
    }

    @Override
    public void AoClicar() {
        botao = new JButton("sair");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }

        });
    }
}
