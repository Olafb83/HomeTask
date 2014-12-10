package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Olaf on 03.12.2014.
 */
public class FactoryClass implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new CopyFileStrategy() {
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
        };
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategy() {
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
        };
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategy() {
            @Override
            public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
                copyFile(new File(s), new File(s1));
            }

            @Override
            public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
                int byteRead;
                long startTime;
                long elapsedTime;
                try (InputStream in = new BufferedInputStream(new FileInputStream(file));
                     OutputStream out = new BufferedOutputStream(new FileOutputStream(file1))){
                    startTime = System.nanoTime();
                    while ((byteRead = in.read()) != -1) {
                        out.write(byteRead);
                    }
                    elapsedTime = System.nanoTime() - startTime;
                    System.out.println("Buffer Copy Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategy() {
            @Override
            public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
                copyFile(new File(s), new File(s1));
            }
            @Override
            public void  copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
                long startTime;
                long elapsedTime;
                try {
                    FileChannel fcin = new FileInputStream(file).getChannel();
                    FileChannel fcout = new FileOutputStream(file1).getChannel();
                    startTime = System.nanoTime();
                    fcin.transferTo(0, fcin.size(), fcout);
                    elapsedTime = System.nanoTime() - startTime;
                    System.out.println("Channel Copy Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
                }catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
    }
}
