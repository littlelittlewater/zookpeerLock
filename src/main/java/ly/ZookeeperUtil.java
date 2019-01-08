package ly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;

public class ZookeeperUtil implements Closeable {
    Logger logger = LoggerFactory.getLogger(ZookeeperUtil.class);

    public static ZookeeperUtil tryLock(String s) {
        return new ZookeeperUtil();
    }

    @Override
    public void close() {
        logger.info("i am close");
    }

    public void dosomething() {
        logger.info("i am dosomthting");
    }
}
