package ly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server2 {
    private static Logger logger = LoggerFactory.getLogger(Server2.class);

    public static void main(String[] args) throws InterruptedException {
        try(ZookeeperUtil zk = ZookeeperUtil.tryLock("lock")){
            zk.dosomething();
            Thread.sleep(1000);
            logger.info("i am doing something");
        }
    }
}
