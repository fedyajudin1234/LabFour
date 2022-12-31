package org.example;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class HashTest {
    Hash hash = new Hash(10);
    Hash hash1 = new Hash(0);
    ObjectBuilder objectBuilder = new ObjectBuilder() {
        @Override
        public String typeName() {
            return objectBuilder.typeName();
        }

        @Override
        public Object create() {
            return objectBuilder.create();
        }

        @Override
        public String toString(Object value) {
            return objectBuilder.toString();
        }
    };

        @Test
        public void put() {
            System.out.println("Введите String, для создания объектов класса StringObjectBuilder, или Vector, для создания объектов класса Vector2D");
            Scanner scanner = new Scanner(System.in);
            String valueType = scanner.nextLine();
            if(valueType.equals("String")){
                for (int i = 0; i < 10; i++) {
                    hash.put(new IntObjectBuilder().create(), new StringObjectBuilder().create());
                }
            }else if(valueType.equals("Vector")){
                for (int i = 0; i < 10; i++) {
                    hash.put(new IntObjectBuilder().create(), new Vector2D().create());
                }
            }
        }

        @Test
        public void get() {
            hash.get(100);
        }

        @Test
        public void remove() {
            hash.remove(100);
        }

        @Test
        public void testToString() {
            System.out.println(hash.toString());
        }

        @Test
        public void forEach() {
            hash.forEach(value -> objectBuilder.toString(value));
        }

        @Test
        public void sizeRecorder() {
            hash.sizeRecorder();
        }

        @Test
        public void testClone() {
            try {
                hash1 = hash.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Test
        public void insert() {
            hash = hash1.insert(hash);
        }

        @Test
        public void resizeHash() {
            hash = hash.resizeHash(hash, hash1);
        }
}