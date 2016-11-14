package action.impl;
//Operace nasobeni
import action.AbstractOperatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class MultiplicationAction extends AbstractOperatorAction {
    public MultiplicationAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }
    
    @Override
    public void performActualOperatorAction() {
        getModel().setStoredResult(getModel().getStoredResult() * Double.valueOf(getModel().getCurrentInput()));
    }
}
