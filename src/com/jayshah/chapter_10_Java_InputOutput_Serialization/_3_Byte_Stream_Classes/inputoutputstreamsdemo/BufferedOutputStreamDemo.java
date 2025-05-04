package com.jayshah.chapter_10_Java_InputOutput_Serialization._3_Byte_Stream_Classes.inputoutputstreamsdemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        String str = "this is buffered demo program..!!";

        FileOutputStream fos = new FileOutputStream("E:\\ccc.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(str.getBytes());

        bos.flush();
        bos.close();

        fos.close();
    }
}

/*

    - flush() method is used forcefully write the data into the stream or output file before erasing the buffer memory.
    - close() : remove/delete entire stream.
 */