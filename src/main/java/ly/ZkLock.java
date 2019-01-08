package ly;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZkLock implements AutoCloseable {

    private Logger logger = LoggerFactory.getLogger(ZkLock.class);
    private InterProcessMutex lock;

    public ZkLock(CuratorFramework client, String s) throws Exception {
        lock = new InterProcessMutex(client, s);
        lock.acquire();
    }

    public void close() throws Exception {
        logger.info("i am close");
        lock.release();
    }
}
