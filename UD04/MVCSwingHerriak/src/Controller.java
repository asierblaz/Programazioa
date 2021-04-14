
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

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
    ArrayList<Herria> herriak;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        anadirActionListener(this);
        datuakKargatu();

    }

    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.GehituButton.addActionListener(listener);
        view.EzabatuButton.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                herriaGehitu();
                datuakKargatu();
                break;

            case "EZABATU":
                herriaEzabatu();
                datuakKargatu();
                break;
        }

    }

    public void herriaGehitu() {
        String herria = view.HerriaField.getText();
        String probintzia = view.probintziaCombo.getSelectedItem() + "";
        String oharrak = view.OharrakTextArea.getText();
        boolean hondartza = false;
        if (view.hondartzaCheckBox.isSelected()) {
            hondartza = true;
        }
        Herria h = new Herria(herria, probintzia, hondartza, oharrak);

        model.herriaGehitu(h);
        JOptionPane.showMessageDialog(null, "Herria Gorde da", "Informazioa", JOptionPane.INFORMATION_MESSAGE);

    }

    public void inprimatu() {
        System.out.println(model.herriakInprimatu());

        System.out.println(model.inprimatuToArray());
    }

    public void datuakKargatu() {

        herriak = model.inprimatuToArray();

        int numDatos = view.modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {   //para borrar la tabla y no se sobrecargue
            view.modelo.removeRow(0);
        }
        view.tabla.setVisible(true);

        String[] info = new String[4];
        int cont = 1;
        for (Herria h : herriak) {
            info[0] = h.getHerria();
            info[1] = h.getProbintzia();
            info[2] = h.isHondartza() + "";
            info[3] = h.getOharrak();
            view.modelo.addRow(info);

        }

    }

    public void herriaEzabatu() {

        String herria =view.tabla.getValueAt(view.tabla.getSelectedRow(),0)+"";
        
        try {
            
            
            model.herriaEzabatu(herria);
            JOptionPane.showMessageDialog(null, "Herria Ezabatu da", "Informazioa", JOptionPane.INFORMATION_MESSAGE);

          
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Aukeratu taulatik bat", "Errorea", JOptionPane.WARNING_MESSAGE);

        }

    }
}
