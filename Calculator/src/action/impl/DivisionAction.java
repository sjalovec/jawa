package action.impl;
//Operace deleni
import action.AbstractOperatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public abstract class DivisionAction extends AbstractOperatorAction {
    public DivisionAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }
    
    @Override
    protected void performActualOperatorAction() {
        getModel().setStoredResult(getModel().getStoredResult() / Double.valueOf(getModel().getCurrentInput()));
    }
}
