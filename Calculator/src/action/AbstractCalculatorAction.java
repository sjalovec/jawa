package action;
//Spolecny predek pro akce na kalkulacce

import javax.swing.JTextField;
import model.CalculatorModel;

public abstract class AbstractCalculatorAction implements CalculatorActionIface {

    protected JTextField resultField;
    protected CalculatorModel model;

    public AbstractCalculatorAction(JTextField resultField, CalculatorModel model) {
        this.resultField = resultField;
        this.model = model;
    }

    @Override
    public abstract void performInputAction();

    public void setResultField(JTextField resultField) {
        this.resultField = resultField;
    }

    public void setModel(CalculatorModel model) {
        this.model = model;
    }

    public JTextField getResultField() {
        return resultField;
    }

    public CalculatorModel getModel() {
        return model;
    }

}
