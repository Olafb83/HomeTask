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
        // String inFileStr = "src/Resorses/file.txt";
        //String outFileStr = "src/Resorses/file1.txt";
        int byteRead;
        try (InputStream in = new FileInputStream(s); OutputStream out = new FileOutputStream(s1)) {
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
    public void copyFile(File file, File file1)throws FileAlreadyPresentsException, FileCopyFailedException {
        int byteRead;
        try (InputStream in = new FileInputStream(file); OutputStream out = new FileOutputStream(file1)) {
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