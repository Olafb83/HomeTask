package com.homeTask.task10;


import com.homeTask.task09.BufferCopyClass;
import com.homeTask.task09.ByteCopyClass;
import com.homeTask.task09.ChannelsCopyClass;
import com.homeTask.task09.NewCopyClass;
import com.sourceit.hometask.threads.*;

/**
 * Created by Olaf on 09.12.2014.
 */
public class Test {
    public static void main(String[] args) {

        CopyFileTask ct1 = new CopyFileClass();
        ct1.setFileCopyUtils(new BufferCopyClass());
        ct1.setSourceFilePath('');
        ct1.setDestinyFilePath('');

        CopyFileTask ct2 = new CopyFileClass();
        ct2.setFileCopyUtils(new ChannelsCopyClass());
        ct2.setSourceFilePath('');
        ct2.setDestinyFilePath('');

        CopyFileTask ct3 = new CopyFileClass();
        ct3.setFileCopyUtils(new NewCopyClass());
        ct3.setSourceFilePath('');
        ct3.setDestinyFilePath('');

        FindFilesTask ft1 = new FindFileClass();
        ft1.setDirectory('');
        ft1.setFileNameSearchString('');
        ft1.setPrintStream(System.out);

        //..

        TasksStorage storage = new TaskStorageClass();
        storage.add(ct1);
        storage.add(ct2);
        storage.add(ct3);
        storage.add(ft1);

        TaskExecutorClass e1 = new TaskExecutorClass();
        TaskExecutorClass e2 = new TaskExecutorClass();
        TaskExecutorClass e3 = new TaskExecutorClass();
        e1.setStorage(storage);
        e2.setStorage(storage);
        e3.setStorage(storage);

        e1.start();
        e2.start();
        e3.start();

        try {
            e1.join();
            e2.join();
            e3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            e1.stop();
            e2.stop();
            e3.stop();
        }
    }

    public synchronized void onComplete() {

    }
}
