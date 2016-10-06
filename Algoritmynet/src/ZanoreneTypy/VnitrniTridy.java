package ZanoreneTypy;

public class VnitrniTridy {

    public static void main(String[] args) {
        Klobouk mujKlobouk = new Klobouk("Pokustonuv klobouk");

        Klobouk.Kralik[] kralici = mujKlobouk.getObyvatel();

        for (Klobouk.Kralik k : kralici) {
            System.out.println(k);
        }

    }

}

class Klobouk {

    private String hatName;
    private Kralik[] obyvatel;

    public Klobouk(String name) {
        this.hatName = name;
        this.obyvatel = new Kralik[2]; //pole dvou králíků???
        obyvatel[0] = new Kralik("Bob");
        obyvatel[1] = new Kralik("Bobek");

    }

    public String getHatName() {
        return hatName;
    }

    public void setHatName(String hatName) {
        this.hatName = hatName;
    }

    public Kralik[] getObyvatel() {
        return obyvatel;
    }

    public class Kralik {

        private String name;

        public Kralik(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() { //toString je interni javova metoda
            String result = "Ahoj, ja jsem " + this.name+ " a bydlim v klobouku, který se jmenuje " + Klobouk.this.hatName + ".";
            //Klobouk.this == reference na obalujici instanci
            return result;
        }

    }
}
