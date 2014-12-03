package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Olaf on 02.12.2014.
 */
public class NewCopyClass implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {

    }
}
