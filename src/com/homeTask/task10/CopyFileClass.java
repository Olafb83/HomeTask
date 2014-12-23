package com.homeTask.task10;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

/**
 * Created by Olaf on 09.12.2014.
 */
public class CopyFileClass implements CopyFileTask {
    private CopyFileStrategy strategy;
    private String srcFPath;
    private String destFPath;
    private int tryCount;

    @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        strategy = copyFileStrategy;
    }

    @Override
    public void setSourceFilePath(String s) {
        srcFPath = s;
    }

    @Override
    public void setDestinyFilePath(String s) {
        destFPath = s;
    }

    @Override
    public int getTryCount()  {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            strategy.copyFile(srcFPath, destFPath);
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException(e);
        }
    }
}
