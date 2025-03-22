package br.com.trabalho.filecreation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Creator {
    public static void main(String[] args) throws IOException {
        var file = Files.createFile(Paths.get("./aula.txt"));
        Files.writeString(file, "Luis Trindade");
    }
}