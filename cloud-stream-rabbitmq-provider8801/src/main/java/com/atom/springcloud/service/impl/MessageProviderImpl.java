package com.atom.springcloud.service.impl;

import com.atom.springcloud.service.IMessageProvider;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Reference
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
       String serial = UUID.randomUUID().toString();
       output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*********serial:"+serial);
       return null;
    }
}
