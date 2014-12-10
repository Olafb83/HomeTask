package com.homeTask.task10;

import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

import com.sourceit.hometask.threads.Task;

/**
 * Created by Olaf on 09.12.2014.
 */
public class TaskExecutorClass implements TaskExecutor, Runnable{

    TasksStorage store;
    Thread thread;

    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        store = tasksStorage;
    }

    @Override
    public TasksStorage getStorage() {
        return store;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void stop() throws IllegalStateException {
        thread.interrupt();
    }

    @Override
    public void run() {

            Task t = null;
            while (true) {
                synchronized (this) {
                    try {
                        wait(100);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                try {
                    t = store.get();
                    if (t == null) {
                        break;
                    }
                    t.execute();
                } catch (TaskExecutionFailedException e) {
                    if (t.getTryCount() < 5) {
                        t.incTryCount();
                        store.add(t);
                    }
                }
            }
    }

    public void join() throws InterruptedException {
        thread.join();
    }
}
