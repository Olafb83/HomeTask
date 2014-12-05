package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Olaf on 02.12.2014.
 */
public class ByteCopyClass implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s1));

    }
    @Override
    public void copyFile(File file, File file1)throws FileAlreadyPresentsException, FileCopyFailedException {
        int byteRead;
        long startTime;
        long elapsedTime;
        try (InputStream in = new FileInputStream(file); OutputStream out = new FileOutputStream(file1)) {
            startTime = System.nanoTime();
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Byte to Byte Copy Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileNotFoundException ex) {
                ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }


}