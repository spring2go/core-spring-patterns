package io.spring2go.corespring.singleton_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DemoSingleton instanceOne = DemoSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        // 从文件反序列化到对象
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}
