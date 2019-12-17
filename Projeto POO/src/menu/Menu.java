package menu;

import controlador.ControladorMenu;

public class Menu
{
    public static void main(String[] args) {
    	
    	ControladorMenu controladorMenu = new ControladorMenu();
    	
    	int opcaoSelecionada;
         
    	while(true) {
        opcaoSelecionada = controladorMenu.exibirMenu();
        
        	switch(opcaoSelecionada){
            
            case 1:
                controladorMenu.escolherModalidade();
                break;
            case 2:
            	controladorMenu.receberInformacoesEvento();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
 
                break;
            case 6:

                break;
            case 7:
            	controladorMenu.buscarTodos();
                break;
            case 8:

                break;
            case 9:
  
                break;
            default:
                System.out.println("Opção inválida.");
        }
    	}
        
       
    }
    
   
}