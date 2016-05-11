package fronteira;

import controle;
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
            case 1: /* escolhe criar um contato*/
                controle.criarContato();
                break;

            case 2: /* escolhe criar um evento */
                controle.criarEvento();
                break;

            case 3: /* escolhe mostrar os convidades de um evento' */
                controle.mostrarConvidados();
                break;
        }
    }
}
