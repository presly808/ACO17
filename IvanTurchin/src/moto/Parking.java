package moto;

import java.util.Arrays;

public class Parking {

    private String address;
    private int allPlaces;
    private int freePlaces;
    private String key;
    private boolean isOpen;

    private Motorcycle[] motos = new Motorcycle[20];
    private int freePlace = 0;

    public Parking(String address, String key) {
        this.address = address;
        this.key = key;

        this.freePlaces = this.motos.length;
    }

    public boolean open(String key) {
        isOpen = this.key.equals(key);
        return isOpen;
    }

    public boolean close(String key) {
        if (this.key.equals(key)) {
            isOpen = false;
        }

        return isOpen;
    }

    public void addMoto(Motorcycle motorcycle) {
        if (motorcycle == null || !isOpen) {
            return;
        }

        if (this.motos.length == this.freePlaces) {
            this.motos = Arrays.copyOf(this.motos, this.motos.length * 2);
        }

        this.motos[this.freePlace] = motorcycle;
        this.freePlace++;
        this.freePlaces--;
    }

    public Motorcycle takeLastMoto() {

        if (!isOpen) {
            return null;
        }

        for (int i = this.motos.length - 1; i >= 0; i--) {
            if (this.motos[i] != null) {
                return this.motos[i];
            }
        }

        this.freePlace--;
        this.freePlaces++;
        return null;
    }

    public void addMotoByPlaceNumber(int index, Motorcycle motorcycle) {
        if (index <= 0 || index > this.motos.length || this.motos[index - 1] != null || !isOpen) {
            return;
        }

        this.motos[index - 1] = motorcycle;
        this.freePlaces--;
    }

    public Motorcycle takeMotoByPlaceNumber(int index) {
        if (index <= 0 || index > this.motos.length || this.motos[index - 1] == null || !isOpen) {
            return null;
        }

        this.freePlaces++;
        return this.motos[index - 1];
    }

    public void clearGarage() {
        if (!isOpen) {
            return;
        }

        for (int i = 0; i < this.motos.length; i++) {
            this.motos[i] = null;
        }

        this.freePlaces = this.motos.length;
        this.freePlace = 0;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public String showAll() {
        String res = "";

        for (int i = 0; i < this.motos.length; i++) {
            if (this.motos[i] != null) {
                res += new StringBuilder().append(this.motos[i].getModel() + " ");
            }
        }

        return res;
    }

    public String showInfo() {

        return String.format("address - %s\nall places - %d\nfree places - %d\nkey - %s\nis open - %s",
                this.address, this.allPlaces, this.freePlaces, this.key, this.isOpen);
    }

    public String getAddress() {
        return address;
    }

    public int getAllPlaces() {
        return allPlaces;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public String getKey() {
        return key;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Motorcycle[] getMotos() {
        return motos;
    }

    public int getFreePlace() {
        return freePlace;
    }


}
