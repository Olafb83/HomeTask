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
        //copy file ~ 35mb
        try {
            fc.createChannelsCopyFileStrategy().copyFile("src/Resorses/file.3gp", "src/Resorses/file1.3gp");
            // 451 msec
            //fc.createSimpleCopyFileStrategy().copyFile("src/Resorses/file.3gp", "src/Resorses/file1.3gp");
            // to much time...
            fc.createBufferedCopyFileStrategy().copyFile("src/Resorses/file.3gp", "src/Resorses/file1.3gp");
            //2130 msec
            fc.createFilesCopyFileStrategy().copyFile("src/Resorses/file.3gp", "src/Resorses/ff.3gp");
            //77  msec... if file is exists - throw exception??
        }catch (FileAlreadyPresentsException ex){
            ex.printStackTrace();
        }catch (FileCopyFailedException ex){
            ex.printStackTrace();
        }
    }
}
