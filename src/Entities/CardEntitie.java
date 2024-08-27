package Entities;

public class CardEntitie {

    private String cardNumber;
    private int cardType;


    public CardEntitie(String cardNumber, int cardType) {
        if (!(cardType == 1 || cardType == 2)){
            throw new RuntimeException("Erro no tipo do cartão");
        } else {
            System.out.println("Crédito/débito selecionado");
        }

        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CardEntitie{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardType=" + cardType +
                '}';
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }
}
