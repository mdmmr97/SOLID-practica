package com.kreitek.files;

import com.kreitek.dependencias.FileSystemItem;
import com.kreitek.dependencias.Ifile;
import com.kreitek.files.error.InvalidFileFormatException;

public class Convesion extends File {
    public Convesion(FileSystemItem parent, String name) {
        super(parent, name);
    }
    public String extractName(){
        int indexOfLastDot = name.lastIndexOf(".");
        String nameWithoutExtension = name;
        if (indexOfLastDot > 0) {
            nameWithoutExtension = name.substring(0, indexOfLastDot);
        }
        return nameWithoutExtension;
    }
    public FileSystemItem convertMp3ToWav() {
        if (!"mp3".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }
        String newFileName = extractName() + ".wav";
        File result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
    public FileSystemItem convertWavToMp3() {
        if (!"wav".equalsIgnoreCase(getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        String newFileName = extractName() + ".mp3";
        File result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}
