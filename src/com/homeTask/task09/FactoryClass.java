package com.homeTask.task09;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;

/**
 * Created by Olaf on 03.12.2014.
 */
public class FactoryClass implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new ByteCopyClass();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new NewCopyClass();
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new BufferCopyClass();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new ChannelsCopyClass();
    }
}
