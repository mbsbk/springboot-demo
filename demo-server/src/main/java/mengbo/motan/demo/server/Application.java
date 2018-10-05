package mengbo.motan.demo.server;


import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import mengbo.motan.demo.server.service.MotanDemoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(MotanDemoServiceImpl.class);
    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);

        logger.info("server start ...");

    }


}
