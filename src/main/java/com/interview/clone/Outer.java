package com.interview.clone;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Data
class Inner implements Serializable {
    private String name;
}
@Data
@Slf4j
public class Outer implements Serializable {
    private Inner inner;
    public Outer myClone(){
        Outer outer = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer = (Outer) ois.readObject();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } catch (ClassNotFoundException e){
            log.error(e.getMessage(), e);
        }
        return outer;
    }

    public static void main(String[] args){
        Outer outer1 = new Outer();
        Inner inner = new Inner();
        inner.setName("1");
        outer1.setInner(inner);
        Outer outer2 = outer1.myClone();
        inner.setName("2");
        System.out.println(outer1);
        System.out.println(outer2);
    }

}
