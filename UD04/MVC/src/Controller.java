
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Controller implements ActionListener {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        anadirActionListener(this);       
        imprimatu();
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
            izenaGehitu();
            imprimatu();
                    
        }
        
    }
    
    
    public void izenaGehitu(){
       
        Izena i = new Izena(view.jTextFieldIzena.getText());
        model.izenaGehitu(i);
        System.out.println("Izena dban gorde da");
        
    }
   
    
    public void imprimatu(){
    
        view.jTextAreaIzenak.setText(model.izenakImprimatu());
    }
}