/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Computador
 */
public class MostraMenu {
    public static void main(String args []) {
		MenuItem [] menuItens = new MenuItem[4];

		menuItens[0] = new MenuItem(""
                        + "\n"
                        + "====================\n"
                        + "       Menu 1\n"
                        + "====================\n");
                menuItens[1] = new MenuItem(""
                        + "\n"
                        + "====================\n"
                        + "       Menu 2\n"
                        + "====================\n");
                
                menuItens[2] = new MenuItem(""
                        + "\n"
                        + "====================\n"
                        + "       Menu 3\n"
                        + "====================\n");
                
                
                menuItens[3] = new MenuItem(""
                        + "\n"
                        + "====================\n"
                        + "       Menu 4\n"
                        + "====================\n");
		

		Iterator menuIterator = new MenuIterator(menuItens);

		while (menuIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)menuIterator.next();
			System.out.println(menuItem.nome);
		}
	}
}
