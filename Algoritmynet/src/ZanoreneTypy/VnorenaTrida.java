package ZanoreneTypy;

public class VnorenaTrida {

    public static void main(String[] args) {
        CellPhone mujTelefon = new CellPhone("501-55-1987"); //standardni konstruktor

        //vytvoření instanci vnořené třídy, je potřeba se "provolat" až ke konstruktoru
        CellPhone.SIMCard mojeKarta = new CellPhone.SIMCard("123456789");
        mujTelefon.setCard(mojeKarta);

        System.out.println(mujTelefon);

    }

}

class CellPhone {

    private final String imei;
    private SIMCard card;

    public CellPhone(String imei) {
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }

    public void setCard(SIMCard card) {
        this.card = card;
    }

    @Override
    public String toString() { //toString je javova interni metoda
        String phoneNumber = null;
        if (this.card != null) {
            phoneNumber = "obsahuji sim kartu s číslem " + card.getPhoneNumber() + ".";
        } else {
            phoneNumber = "nemam sim.";
        }
        return "Jsem mobil a mam imei: " + imei + phoneNumber;
    }

    //vnorená třída SIM karty (to je ten typ nahore)
    public static class SIMCard {

        private String phoneNumber;

        public SIMCard(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

    }

}
