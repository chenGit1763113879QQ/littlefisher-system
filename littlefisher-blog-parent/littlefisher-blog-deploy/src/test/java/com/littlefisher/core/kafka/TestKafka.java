package com.littlefisher.core.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.littlefisher.blog.deploy.Application;
import com.littlefisher.core.common.utils.LittleFisherLogger;

/**
 * Description: TestKafka.java
 *
 * Created on 2017年12月05日
 *
 * @author jinyanan
 * @version 1.0
 * @since v1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestKafka {

    private LittleFisherLogger logger = LittleFisherLogger.getLogger(TestKafka.class);

//    @Autowired
//    private KafkaTemplate kafkaTemplate;

    @Test
    public void testKafka() {
//        String topic = "TestTopic";
//        Message message;
//        for (int i = 0; i < 100; i++) {
//            message = new Message(topic, String.valueOf(i), "data-" + String.valueOf(i));
//            logger.debug("SendMessage: [{}]", message);
//            kafkaTemplate.send(topic, GsonUtil.obj2Json(message));
//        }

//        while (true) {
//
//        }
    }
}
