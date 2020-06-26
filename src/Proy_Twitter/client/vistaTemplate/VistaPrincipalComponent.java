/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.vistaTemplate;

/**
 *
 * @author lenovo
 */
public class VistaPrincipalComponent {
    
    private VistaPrincipalTemplate vistaprincipaltemplate;
    public VistaPrincipalComponent(){
        vistaprincipaltemplate = new VistaPrincipalTemplate(this);
    }
    
    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return vistaprincipaltemplate;
    }
}
