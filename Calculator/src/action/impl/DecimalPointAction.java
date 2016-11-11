package action.impl;
//Akce provedena po stisku tlacitka desetinne carky

import action.AbstractCalculatorAction;
import javax.swing.JTextField;
import model.CalculatorModel;

public class DecimalPointAction extends AbstractCalculatorAction {

    public DecimalPointAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }

    @Override
    public void performInputAction() {
        if (!model.isDecimalPresent()) {
            getModel().setDecimalPointPresent(true);
            if (getModel().getCurrentInput().length() > 0) {
                getModel().setCurrentInput(getModel().getCurrentInput() + ".");
            } else {
                getModel().setCurrentInput("0.");
            }
            getResultField().setText(getModel().getCurrentInput());
        }
    }
}
