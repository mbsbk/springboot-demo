package mengbo.motan.demo.api;

import com.weibo.api.motan.rpc.ResponseFuture;
import mengbo.motan.demo.pojo.User;

public interface MotanDemoServiceAsync extends MotanDemoService {

    ResponseFuture helloAsync(String name);

    ResponseFuture renameAsync(User user, String name);
}
