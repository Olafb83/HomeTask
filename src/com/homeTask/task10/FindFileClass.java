package com.homeTask.task10;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Olaf on 09.12.2014.
 */
public class FindFileClass implements FindFilesTask{

    private int tryCount;
    private String setDir;
    private String setName;
    private PrintStream stream;

    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {
        setDir = s;
    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {
        setName = s;
    }

    @Override
    public void setPrintStream(PrintStream printStream) {
        stream = printStream;
    }

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File folder = new File(setDir);
        for (File f : folder.listFiles()) {
            if (setName.equals(f.getName())) {
                stream.println(f.getAbsoluteFile());
            }
        }
    }
}
