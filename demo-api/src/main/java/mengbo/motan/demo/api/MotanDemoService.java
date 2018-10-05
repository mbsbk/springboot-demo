package mengbo.motan.demo.api;

import com.weibo.api.motan.transport.async.MotanAsync;
import mengbo.motan.demo.pojo.User;

@MotanAsync
public interface MotanDemoService {
    String hello(String name);

    User rename(User user, String name) throws Exception;
}
