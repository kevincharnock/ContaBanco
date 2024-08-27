package BankAccounts.TypeOfPayments;

public class TypeToPayment {

    protected double value;

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TypeToPayment{" +
                "value=" + value +
                '}';
    }
}

