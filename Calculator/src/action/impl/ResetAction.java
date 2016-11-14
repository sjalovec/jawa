package action.impl;
//Akce resetovaciho tlacitka

import action.AbstractCalculatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class ResetAction extends AbstractCalculatorAction {

    public ResetAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }
    
    @Override
    public void performInputAction() {
        getModel().resetModel();
        getResultField().setText(String.valueOf(getModel().getStoredResult()));
    }
}
