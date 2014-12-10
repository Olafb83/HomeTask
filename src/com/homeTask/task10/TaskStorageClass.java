package com.homeTask.task10;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Olaf on 09.12.2014.
 */
public class TaskStorageClass implements TasksStorage{

    private List<Task> tasks = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (count() == 0) return null;
        //Task t = tasks.get(0);
        //if (t == null)
        //    return null;
        return tasks.remove(0);
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
