//package com.egg.core.rabbitmq.test;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessageProperties;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.nio.charset.Charset;
//import java.util.*;
//
///**
// * 消息队列生产队列
// * @author TengZhongBin
// * @since 2019/05/03
// */
//@Component
//public class Sender {
////    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public Sender(AmqpTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public void send() {
//        System.out.println("**********************开送消息****************************");
//        String exChange = "exchange"; // 交换机名称
//        String queueName = "tft_search"; // 队列名称
//
//        // 第一种方式 直接发
//        MessageProperties messageProperties=new MessageProperties();
//        int random=(int)(Math.random()*10);
//        String messageId= UUID.randomUUID().toString().replaceAll("-", "")+random;
//        messageProperties.setMessageId(messageId);
//        messageProperties.setContentEncoding("UTF-8");
//
//        byte[] x = "你好".getBytes(Charset.forName("utf-8"));
//        Message message = new Message(x, messageProperties);
//        this.rabbitTemplate.send("hjserver", message);
//
//        // 第二种方式 路由(队列) + 消息 (先转后发)
//        rabbitTemplate.convertAndSend("tft_search", "Hello World!!");
//
//        // 第三种方式 交换机 + 路由(队列) + 消息 (先转后发)
//        // rabbitTemplate.convertAndSend(exChange, "hjserver","Hello World!!!!!!!!!!");
//
//        // 发送死信队列， 设置超时且无人接受然后交换机会发送给其中绑定关系的队列， 监听它们
//        System.out.println("开始死信。。。。。。。。。。。。。。。。。。");
//        MessageProperties messageProperties2=new MessageProperties();
//        int random2=(int)(Math.random()*10);
//        String messageId2= UUID.randomUUID().toString().replaceAll("-", "")+random2;
//        messageProperties2.setMessageId(messageId);
//        messageProperties2.setContentEncoding("UTF-8");
//        messageProperties2.setExpiration("5000"); // 设置消息过期时间
//        this.rabbitTemplate.send("customer3", new Message("What a good day".getBytes(), messageProperties2));
//
//    }
//
//    public static void main(String[] args) {
//        // of的值为空报空指针异常， ofNullable方法可以为空
//        Optional<String> s = Optional.of(null);
////        System.out.println("optional create a string object : " + s.orElse("Hello"));
////
////        Optional.ofNullable("123").ifPresent(value -> {
////            System.out.println("值为: " + value);
////        });
//
////        System.out.println(new Sender(null).test().getParent());
//        /*BigDecimal sumBalance = new BigDecimal(0.67);
//        BigDecimal rate = new BigDecimal(0.4);
//
//        System.out.println("qq: " + rate.abs());
//        System.out.println("q :" + sumBalance.multiply(rate).setScale(2, RoundingMode.DOWN));
//        System.out.println("xxxx ： " + new BigDecimal(3).divide(new BigDecimal(5000),0,BigDecimal.ROUND_UP));
//        */
//
//        /*List<String> allDelList = new ArrayList<String>();
//        allDelList.add("Hello");
//        allDelList.add("World");
//
//        HashMap<String, Long> map = new HashMap<String, Long>();
//        map.put("A", 1l);
//        map.put("B", 2L);*/
//
//        /*allDelList.forEach(s -> {
//            System.out.println(s);
//        });*/
//        /*for(String s: allDelList) {
//            System.out.println("s: " + s);
//        }
//
//        Long lo = map.get("A").longValue();
//        System.out.println("long: " + lo + "  toString : " + map.get("A").toString());
//
//        map.forEach((k, v) -> {
//            System.out.println("k: " + k + "  v: " + v);
//        });*/
//
//    }
//
//    public ClassLoader test() {
//        ClassLoader cl = this.getClass().getClassLoader();
//        return cl;
//    }
//
//    public void t(String s) {
//
//    }
//}
