package com.kjq.springcloud.service.imp;

import com.kjq.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 孔佳齐丶
 * @create 2020-09-03 8:58
 * @package com.kjq.springcloud.service.imp
 */
//@Service
    //Source定义消息的推送管道
@EnableBinding(Source.class)
public class MessagetProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  //消息发送通道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******serial="+serial);
        return null;
    }
}
