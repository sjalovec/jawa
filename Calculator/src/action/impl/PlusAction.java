package action.impl;
//Operace scitani

import action.AbstractOperatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public abstract class PlusAction extends AbstractOperatorAction {

    public PlusAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }

    @Override
    public void performActualOperatorAction() {
        getModel().setStoredResult(getModel().getStoredResult() + Double.valueOf(getModel().getCurrentInput()));
    }
}
