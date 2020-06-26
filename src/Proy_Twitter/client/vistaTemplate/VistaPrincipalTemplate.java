
package Proy_Twitter.client.vistaTemplate;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Admin
 */
public class VistaPrincipalTemplate extends JFrame {

    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaprincipalcomponent;

    private JPanel pMenu, pInicio, pTweet, pBuscar, pNavegacion;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaprincipalcomponent) {
        
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        this.vistaprincipalcomponent = vistaprincipalcomponent;
        CrearJpanels();
        this.setTitle("Vista Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300, 750);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void CrearJpanels(){
        pMenu = sObjGraficos.construirJPanel(0, 0, 280, 750, sRecursos.getColorAzulos(), sRecursos.getBorderLado());
        this.add(pMenu);
        pInicio = sObjGraficos.construirJPanel(280, 0, 690, 60, sRecursos.getColorAzulos(), sRecursos.getBorderTodos());
        this.add(pInicio);
        pTweet = sObjGraficos.construirJPanel(280, 60, 690, 110, sRecursos.getColorAzulos(), sRecursos.getBorderTodos());
        this.add(pTweet);
        pNavegacion = sObjGraficos.construirJPanel(280, 170, 690, 680, sRecursos.getColorAzulos(), null);
        this.add(pNavegacion);
        pBuscar = sObjGraficos.construirJPanel(970, 0, 310, 750, sRecursos.getColorAzulos(), sRecursos.getBorderLadoD());
        this.add(pBuscar);
        
    
    }
}