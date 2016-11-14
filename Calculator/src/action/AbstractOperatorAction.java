package action;
//Abstraktni predek akci operatoru

import javax.swing.JTextField;
import model.CalculatorModel;
//Abstraktni predek akci operatoru

public abstract class AbstractOperatorAction extends AbstractCalculatorAction implements OperatorActionIface {

    public AbstractOperatorAction(JTextField resultField, CalculatorModel model) {
        super(resultField, model);
    }

    @Override
    public void performInputAction() {
        getModel().getOperator().performOperatorAction();
        getModel().setOperator(this);
    }

    @Override
    public void performOperatorAction() {
        if (getModel().getCurrentInput().length() > 0) {
            performActualOperatorAction();
            getModel().setCurrentInput("");
            getResultField().setText(String.valueOf(getModel().getStoredResult()));
        }
    }

    //Vykona samotnou akci operatoru
    abstract protected void performActualOperatorAction();
}
