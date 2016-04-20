package fronteira;
import java.beans.*;
import java.util.*;

import system.*;
public class TelaPrincipal implements PropertyChangeListener{
    MenuPrincipal menu;

    public TelaPrincipal() {
        menu = new MenuPrincipal();
        menu.addPropertyChangeListener(this);
    }

    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        int option;
        option = telaPrincipal.menu.run();
    }

    public void propertyChange(PropertyChangeEvent evt) {
        int option;
        option = menu.getOption();
        menu.setOption(0);

        switch (option) {
            /*  private String[] Options = new String[] {"Selecionar Restaurante" ,
            "Fazer Pedido",
            "Sair" };

            */
            case 1: /* escolhe o restaurante*/
                System.out.println("Criar Contato");
                System.out.println();
                break;

            case 2: /* escolhe um produto dos produto disponíveis no restaurante */
                System.out.println("Criar Evento");
                System.out.println();
                break;

            case 3: /* escolhe um produto dos produto disponíveis no restaurante */
                System.out.println("Mostrar Convidados de um Evento");
                System.out.println();
                break;
        }
    }
}
