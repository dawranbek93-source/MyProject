package Test;

import java.util.Objects;

public class Money {

   private String currency;
   private double amount;

    public Money (String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency () {return currency;}
    public double getAmount() {return amount;}
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0 && Objects.equals(currency, money.currency);
    }
@Override
    public int hashCode() {
        return Objects.hash(currency,amount);
    }

    @Override
    public String toString() {
        return "Money{" + "currency='" + currency + '\'' + ", amount=" + amount + '}';
    }


}
