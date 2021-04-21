
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TaulaModeloa extends AbstractTableModel {

    private String[] zutabeIzenak = {"Herria", "Probintzia", "Hondartza", "Oharrak"};
    private ArrayList<Herria> herriak = new ArrayList<>();
    public TaulaModeloa() {
        herriak =Model.inprimatuToArray() ;
        
    }

    @Override

    public int getColumnCount() {
        return zutabeIzenak.length;

    }

    @Override
    public String getColumnName(int col) {
        return zutabeIzenak[col];
    }

    @Override
    public int getRowCount() {
        return herriak.size();
    }

    @Override
    public Object getValueAt(int row, int col) {

        switch (col) {
            case 0:
                return herriak.get(row).getHerria();

            case 1:
                return herriak.get(row).getProbintzia();

            case 2:
                return herriak.get(row).isHondartza();
            case 3:
                return herriak.get(row).getOharrak();

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int colIndex) {

        return getValueAt(0, colIndex).getClass();

    }

}