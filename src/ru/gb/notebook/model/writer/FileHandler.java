package ru.gb.notebook.model.writer;

import java.io.*;

public class FileHandler implements Writable{
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public boolean save(Object o, String fileName) {
        {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
                objectOutputStream.writeObject(o);
                return true;

            } catch (IOException ignored) {
                return false;
            }

        }
    }

    public Object load(String fileName) {
        {
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
                return objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean close() {
        try {
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            return true;
        } catch (IOException ignored) {
            return false;
        }
    }
}