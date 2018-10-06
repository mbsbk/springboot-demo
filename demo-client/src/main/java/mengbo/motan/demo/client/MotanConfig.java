package mengbo.motan.demo.client;


import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MotanConfig {

    @Bean
    @ConfigurationProperties(prefix = "demo.motan.annotation")
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        return motanAnnotationBean;
    }

    @Bean("motan")
    @ConfigurationProperties(prefix = "demo.motan.protocol")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        return config;
    }

    @Bean("demoRegistry")
    @ConfigurationProperties(prefix = "demo.motan.registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        return config;
    }

    @Bean("clientBasicRefererConfig")
    @ConfigurationProperties(prefix = "demo.motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        return config;
    }

}
