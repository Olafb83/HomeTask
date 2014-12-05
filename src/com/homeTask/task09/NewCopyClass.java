package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Olaf on 02.12.2014.
 */
public class NewCopyClass implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(new File(s), new File(s1));
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        long startTime;
        long elapsedTime;
        Path in = Paths.get(String.valueOf(file));
        Path out = Paths.get(String.valueOf(file1));
        startTime = System.nanoTime();
        try {
            Files.copy(in, out);
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("New Copy Class Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileAlreadyExistsException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
