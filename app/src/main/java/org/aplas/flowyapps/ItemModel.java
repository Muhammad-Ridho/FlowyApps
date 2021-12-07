package org.aplas.flowyapps;

public class ItemModel {

    String namaBunga, namaLatin;
    int imgBunga;

    public ItemModel(String namaBunga, String namaLatin, int imgBunga) {
        this.namaBunga = namaBunga;
        this.namaLatin = namaLatin;
        this.imgBunga = imgBunga;
    }

    public void setNamaBunga(String namaBunga) {
        this.namaBunga = namaBunga;
    }

    public void setNamaLatin(String namaLatin) {
        this.namaLatin = namaLatin;
    }

    public void setImgBunga(int imgBunga) {
        this.imgBunga = imgBunga;
    }

    public String getNamaBunga() {
        return namaBunga;
    }

    public String getNamaLatin() {
        return namaLatin;
    }

    public int getImgBunga() {
        return imgBunga;
    }
}
