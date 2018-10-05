package mengbo.motan.demo.server.service;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import mengbo.motan.demo.api.MotanDemoService;
import mengbo.motan.demo.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@MotanService
public class MotanDemoServiceImpl implements MotanDemoService {


    private Logger logger = LoggerFactory.getLogger(MotanDemoServiceImpl.class);


    @Override
    public String hello(String name) {
        logger.info("invoke hello");
        return "Hello " + name;
    }

    @Override
    public User rename(User user, String name) throws Exception {
        logger.info("invoke rename");
        user.setName(name);
        return user;
    }
}
