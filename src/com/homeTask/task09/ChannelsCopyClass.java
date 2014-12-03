package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;
import java.io.*;
import java.nio.channels.*;

/**
 * Created by Olaf on 02.12.2014.
 */
public class ChannelsCopyClass implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            FileChannel fcin = new FileInputStream(s).getChannel();
            FileChannel fcout = new FileOutputStream(s1).getChannel();
            fcin.transferTo(0, fcin.size(), fcout);
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            FileChannel fcin = new FileInputStream(file).getChannel();
            FileChannel fcout = new FileOutputStream(file1).getChannel();
            fcin.transferTo(0, fcin.size(), fcout);
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
