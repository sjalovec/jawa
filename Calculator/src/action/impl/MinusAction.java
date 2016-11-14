package action.impl;
//Operace odecitani

import action.AbstractOperatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class MinusAction extends AbstractOperatorAction {
    public MinusAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }
    
    @Override
    public void performActualOperatorAction() {
        getModel().setStoredResult(getModel().getStoredResult() - Double.valueOf(getModel().getCurrentInput()));
    }
}
