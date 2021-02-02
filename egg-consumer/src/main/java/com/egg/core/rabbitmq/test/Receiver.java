//package com.egg.core.rabbitmq.test;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.Exchange;
//import org.springframework.amqp.rabbit.annotation.Queue;
//import org.springframework.amqp.rabbit.annotation.QueueBinding;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * 消息队列消费队列
// * @author TengZhongBin
// * @since 2019/05/03
// */
//@Component
//public class Receiver {
//    // @RabbitListener(queues = "tft_search", containerFactory="rabbitListenerContainerFactory")
//    // 监听队列
//    @RabbitListener(queues = "tft_search")
//    public void process1(String content) {
//        System.out.println("接收处理队列tft_search当中的消息： " + content);
//    }
//
//    // 监听队列 默认第二个消费者， 测试分流
//    @RabbitListener(queues = "tft_search")
//    public void process3(String content) {
//        System.out.println("接收处理队列 - 分流 - tft_search当中的消息： " + content);
//    }
//
//    //
//    @RabbitListener(queues = "hjserver")
//    public void process3(Message message, Channel channel) {
//        String msg = new String(message.getBody());
//        System.out.println("接收处理队列hjserver 当中的消息： " + msg + "  ch: " + channel);
//    }
//
//
//    /**
//     *  监听死信队列转发过来的消息
//     * @param message
//     * @param channel
//     *//*
//    @RabbitListener(queues = "customer")
//    *//*@RabbitListener(
//            bindings= @QueueBinding(
//                    value=@Queue("cdlx-master"),
//                    exchange=@Exchange("cdlx-exchange"),
//                    key={"master"}
//                    )
//    )*/
//    public void process4(Message message, Channel channel) {
//        String msg = new String(message.getBody());
//        System.out.println("接收处理队列cdlx-master 当中的消息： " + msg);
//    }
//}
