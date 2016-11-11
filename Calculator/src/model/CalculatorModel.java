package model;

public class CalculatorModel {
    private double storedDefault;
    private String currentInput;
    private boolean decimalPointPresent;
    private OperatorActionIface operator;
    private OperatorActionIface defaultOperator;
    
    public CalculatorModel() {
        resetModel();
    }

    public final void resetModel() {
        currentInput = "";
        storedDefault = 0;
        decimalPointPresent = false;
        operator = defaultOperator;
    }
    
    public double getStoredDefault() {
        return storedDefault;
    }
    
    public void setStoredResult(double storedResult) {
        this.storedDefault = storedResult;
    }
    
    public String getCurrentInput() {
        return currentInput;
    }
    
    public void setCurrentInput(String currentInput) {
        this.currentInput = currentInput;
    }
    
    public boolean getDecimalPointPresent() {
        return decimalPointPresent;
    }
    
    public void setDecimalPointPresent(boolean decimalPointPresent) {
        this.decimalPointPresent = decimalPointPresent;
    }
    
    public OperatorActionIface getOperator() {
        return operator;
    }
    
    public void setOperator(OperatorActionIface operator) {
        this.operator = operator;
    }
    
    public void setDefaultOperator(OperatorActionIface defaultOperator) {
        this.defaultOperator = defaultOperator;
        if (this.operator == null) {
            operator = this.defaultOperator;
        }
    }
}