package entities;

public class CurrencyConverter {
    public static double toBePaid(double dollarPrice, double dollarAmount){
        return dollarPrice * 1.06 * dollarAmount;
    }
}
