package domain;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String nameH;
    private int frequencyH;
    private List<Address> addressesList;

    public Hobby(String nameH, int frequencyH, List<Address> addressesList) {
        this.nameH = nameH;
        this.frequencyH = frequencyH;
        this.addressesList = addressesList;
    }

    public String getNameH() {
        return nameH;
    }

    public void setNameH(String nameH) {
        this.nameH = nameH;
    }

    public int getFrequencyH() {
        return frequencyH;
    }

    public void setFrequencyH(int frequencyH) {
        this.frequencyH = frequencyH;
    }

    public List<Address> getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(List<Address> addressesList) {
        this.addressesList = addressesList;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameH='" + nameH + '\'' +
                ", frequencyH=" + frequencyH +
                ", addressesList=" + addressesList +
                '}';
    }
}
