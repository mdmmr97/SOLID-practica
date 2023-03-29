package com.kreitek.service;

import com.kreitek.dependencias.FileSystemItem;

public class FileManager {

    public static int calculateSize(FileSystemItem fileSystemItem) {
        int totalSize = 0;
        return totalSize = fileSystemItem.getSize();
    }

    /*

    Este metodo esta duplicado, y aparte no cumpliria con el principio de inversion de dependencias
    porqu
    public static int calculateSize(List<FileSystemItem> files) {
        int totalSize = 0;

        for(FileSystemItem item : files) {
            if (item instanceof File) {
                totalSize += item.getSize();
            } else if (item instanceof Directory) {
                totalSize += calculateSize(item.listFiles());
            }
        }

        return totalSize;
    }

     */

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
