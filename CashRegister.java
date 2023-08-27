public class CashRegister{
    private double payment;
    public void receivePayment(int coinCount , Coin coinType){
        payment = payment + coinCount * coinType.getValue();
    }

}