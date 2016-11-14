package action.impl;
//Akce tlacitka rovná se (rovnítko)

import action.AbstractCalculatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class ResultAction extends AbstractCalculatorAction {

    public ResultAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }

    @Override
    public void performInputAction() {
        getModel().getOperator().performOperatorAction();
        getResultField().setText(String.valueOf(getModel().getStoredResult()));
    }
}