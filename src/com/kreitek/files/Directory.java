package com.kreitek.files;

import com.kreitek.dependencias.FileSystemItem;
import com.kreitek.dependencias.FileSystemItemBase;
import com.kreitek.dependencias.Idirectory;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements Idirectory {

    /*private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";*/
    private final List<FileSystemItem> files = new ArrayList<>();

    public Directory(FileSystemItem parent, String name) {
        super(parent, name);
        // Aquí vendría lógica que rellena la lista de ficheros
    }
/*
    @Override
    public String getExtension() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }
*/
    @Override
    public List<FileSystemItem> listFiles() {
        return files;
    }
    @Override
    public void addFile(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }
    @Override
    public void removeFile(FileSystemItem file) {
        files.remove(file);
    }

    @Override
    public int getSize() {
        int directorySize = 0;
        for (FileSystemItem item : files) {
            directorySize += item.getSize();
        }
        return directorySize;
    }
/*
    @Override
    public void open() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public void setPosition(int numberOfBytesFromBeginning) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public void write(byte[] buffer) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);

    }

    public void close() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }*/
}
