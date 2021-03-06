package ly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server2 {
    private static Logger logger = LoggerFactory.getLogger(Server2.class);

    public static void main(String[] args) {
        try(ZkLock zk = ZKLockContext.tryLock("/uploaderLock")){
            logger.info("i am start");
            Thread.sleep(100*1000);
            logger.info("i am finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
