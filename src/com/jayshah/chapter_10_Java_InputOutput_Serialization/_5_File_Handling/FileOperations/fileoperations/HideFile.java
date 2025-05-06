package com.jayshah.chapter_10_Java_InputOutput_Serialization._5_File_Handling.FileOperations.fileoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HideFile {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("E:\\javafiles\\aaa.txt");
        //Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);

        Files.setAttribute(p, "dos:hidden", false, LinkOption.NOFOLLOW_LINKS);
    }
}

/*
    for hide file:
    need `java.nio.file` package.

    Path : class and interface both available.
    we use interface
 */