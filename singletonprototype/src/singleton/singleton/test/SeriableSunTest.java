package singleton.singleton.test;

import singleton.SeriableSun;

import java.io.*;

/**
 * @author xuhangsong 2018/8/21
 */
public class SeriableSunTest {
    public static void main(String[] args) {
        SeriableSun ss1 = null;
        SeriableSun ss2 = SeriableSun.getInstance();
        try {
            FileOutputStream fout = new FileOutputStream("seriablesun.obj");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(ss2);
            out.flush();
            out.close();

            FileInputStream fin = new FileInputStream("seriablesun.obj");
            ObjectInputStream in = new ObjectInputStream(fin);
            ss1 = (SeriableSun) in.readObject();
            System.out.println(ss1);
            System.out.println(ss2);
            System.out.println(ss1==ss2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
