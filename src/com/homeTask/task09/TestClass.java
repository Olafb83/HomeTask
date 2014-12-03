package com.homeTask.task09;

import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Olaf on 03.12.2014.
 */
public class TestClass {
    public static void main(String[] args) {

        FactoryClass fc = new FactoryClass();
        try {
            fc.createSimpleCopyFileStrategy().copyFile("src/Resorses/file.txt", "src/Resorses/file.txt");
            fc.createSimpleCopyFileStrategy().copyFile(new File("src/Resorses/file.txt"), new File ("src/Resorses/file.txt"));
            fc.createBufferedCopyFileStrategy().copyFile("src/Resorses/file.txt", "src/Resorses/file.txt");
            fc.createBufferedCopyFileStrategy().copyFile(new File("src/Resorses/file.txt"), new File ("src/Resorses/file.txt"));
            // fc.createChannelsCopyFileStrategy().copyFile('','');
        }catch (FileAlreadyPresentsException ex){
            ex.printStackTrace();
        }catch (FileCopyFailedException ex){
            ex.printStackTrace();
        }
    }
}
