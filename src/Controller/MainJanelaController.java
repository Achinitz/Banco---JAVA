package Controller;

/*
 * @author Gustavo e Laert
 */
public class MainJanelaController {
    
     public void initView(){
        java.awt.EventQueue.invokeLater(() -> {
            new View.MainjanelaView().setVisible(true);
        });
    }
}
