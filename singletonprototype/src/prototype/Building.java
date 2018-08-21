package prototype;

import java.io.*;

/**
 * @author xuhangsong 2018/8/21
 */
public class Building implements Cloneable,Serializable{
    private String name;
    private Double height;
    private Double money;
    private User user;

    public Building() {
        this.name = "1号楼";
        this.height = 100.0;
        this.money = Math.random();
        this.user = new User();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        try {
            return this.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(this);

        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bin);

        return  in.readObject();
    }
}
