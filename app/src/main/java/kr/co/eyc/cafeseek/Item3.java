package kr.co.eyc.cafeseek;

public class Item3 {
    String num;
    String name;
    String address;
    int img;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Item3(String num, String name, String address, int img) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.img = img;
    }
}