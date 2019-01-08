package ly;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZKLockContext {

    Logger logger = LoggerFactory.getLogger(ZKLockContext.class);
    static CuratorFramework cf = null;
    static {
        String zkAddr = "127.0.0.1:2181";
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        cf = CuratorFrameworkFactory.builder()
                .connectString(zkAddr)
                .sessionTimeoutMs(2000)
                .retryPolicy(retryPolicy)
                .build();

        cf.start();
    }

    public static ZkLock tryLock(String s) throws Exception {
        return new ZkLock(cf,s);
    }

    public void dosomething() {
        logger.info("i am dosomthting");
    }
}

