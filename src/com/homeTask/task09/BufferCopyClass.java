package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Olaf on 02.12.2014.
 */
public class BufferCopyClass implements CopyFileStrategy{
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

        //copyFile(new File(s), new File(s1));
        int byteRead;
        try (InputStream in = new BufferedInputStream(new FileInputStream(s));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(s1))){
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        int byteRead;
        try (InputStream in = new BufferedInputStream(new FileInputStream(file));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(file1))){
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
