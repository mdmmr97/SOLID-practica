package com.kreitek.dependencias;

import java.util.List;

public interface Idirectory extends FileSystemItem{
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
}
