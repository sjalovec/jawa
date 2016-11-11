package action.impl;
//Akce provedena po stisku tlacitka hodnoty (cisla)

import action.AbstractCalculatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class NumberAction extends AbstractCalculatorAction {

    private String value;
    
    public NumberAction(JTextField resultField, CalculatorModel model, String value) {
        super(resultField, model);
        this.value = value;
    }    

    @Override
    public void performInputAction() {
        getModel().setCurrentInput(getModel().getCurrentInput() + value);
        getResultField().setText(getModel().getCurrentInput());
    }
}
