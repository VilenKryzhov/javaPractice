package demo1.lesson2.additional3;




import java.util.Objects;



public abstract class Clothes extends Enum {
    public int price;
    public String color;

    public Clothes(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public Clothes(int euroSize, Size size, int price, String color) {
        super(euroSize, size);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return price == clothes.price && Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", euroSize=" + euroSize +
                ", size=" + size +
                '}';
    }
}
