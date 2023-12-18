package ru.gb.notebook.model.notebook.writer;

import ru.gb.notebook.model.notebook.manager.NotebookOrg;

import java.io.*;

public class FileHandler implements Writable{

    @Override
    public boolean save(Serializable serializable, String path){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(serializable);
            return true;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public NotebookOrg load(String path) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            return (NotebookOrg) objectInputStream.readObject();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}