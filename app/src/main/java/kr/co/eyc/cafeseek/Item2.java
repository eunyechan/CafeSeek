package kr.co.eyc.cafeseek;

public class Item2 {
    String title;
    String address;
    int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Item2(String title, String address, int img) {
        this.title = title;
        this.address = address;
        this.img = img;
    }
}
