
package View;

import java.awt.Component;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ButtonEditor extends DefaultCellEditor {
  
    private JButton button;

    public ButtonEditor(JCheckBox checkBox, JButton button) {
        super(checkBox);
        this.button = button;
    }

    @Override
    public boolean isCellEditable(EventObject e) {
        return true;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,
            int row, int column) {
        return button;
    }
}
