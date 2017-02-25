package org.apache.spark.examples.connector;
import org.apache.hyracks.api.channels.IInputChannel;
import org.apache.hyracks.api.dataset.IDatasetInputChannelMonitor;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Created by MingdaLi on 2/21/17.
 */
public class DatasetInputChannelMonitor implements IDatasetInputChannelMonitor {
    private final AtomicInteger nAvailableFrames;

    private final AtomicBoolean eos;

    private final AtomicBoolean failed;

    public DatasetInputChannelMonitor() {
        nAvailableFrames = new AtomicInteger(0);
        eos = new AtomicBoolean(false);
        failed = new AtomicBoolean(false);
    }

    @Override
    public synchronized void notifyFailure(IInputChannel channel) {
        failed.set(true);
        notifyAll();
    }

    @Override
    public synchronized void notifyDataAvailability(IInputChannel channel, int nFrames) {
        nAvailableFrames.addAndGet(nFrames);
        notifyAll();
    }

    @Override
    public synchronized void notifyEndOfStream(IInputChannel channel) {
        eos.set(true);
        notifyAll();
    }

    @Override
    public synchronized boolean eosReached() {
        return eos.get();
    }

    @Override
    public synchronized boolean failed() {
        return failed.get();
    }

    @Override
    public synchronized int getNFramesAvailable() {
        return nAvailableFrames.get();
    }

    @Override
    public synchronized void notifyFrameRead() {
        nAvailableFrames.decrementAndGet();
    }

}
