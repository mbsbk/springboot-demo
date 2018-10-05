package mengbo.motan.demo.server;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MotanConfig {

    /**
     * @Description: 声明Annotation用来指定需要解析的包名
     */
    @Bean
    @ConfigurationProperties(prefix = "demo.motan.annotation")
    public static AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        return motanAnnotationBean;
    }

    /**
     * @Description: 协议配置
     */
    @Bean(name = "demoMotan")
    @ConfigurationProperties(prefix = "demo.motan.protocol")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        return config;
    }

    /**
     * @Description: 注册中心配置
     */
    @Bean(name = "registryConfig1")
    @ConfigurationProperties(prefix = "demo.motan.registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        return config;
    }

    /**
     * @Description: 服务端配置
     */
    @Bean
    @ConfigurationProperties(prefix = "demo.motan.service")
    public BasicServiceConfigBean baseServiceConfig() {
        BasicServiceConfigBean config = new BasicServiceConfigBean();
        return config;
    }
}
