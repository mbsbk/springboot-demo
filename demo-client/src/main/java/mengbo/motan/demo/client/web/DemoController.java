package mengbo.motan.demo.client.web;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import mengbo.motan.demo.api.MotanDemoServiceAsync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @MotanReferer(basicReferer = "clientBasicRefererConfig")
    private MotanDemoServiceAsync motanDemoService;


    @RequestMapping(value = "/hello/{name}",method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@PathVariable String name){
        logger.info("hello "+name);
//        ResponseFuture responseFuture = motanDemoService.helloAsync(name);
       return motanDemoService.hello(name);


    }
}
