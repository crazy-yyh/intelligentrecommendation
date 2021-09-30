package com.btmf.business.utils;

import com.btmf.business.entity.master.UpKafkaEntity;
import org.apache.kafka.clients.producer.*;

import java.util.List;
import java.util.Properties;

public class KafkaUtil {

    /**
     *  发送数据到kafka
     * @param upKafkaEntityList
     * @return
     */

    public Boolean distributeData(List<UpKafkaEntity> upKafkaEntityList) {

        //TODO 待完善
        Properties props = new Properties();
        props.put("bootstrap.servers", "nna:9092, nns:9092, dn1:9092, dn2:9092, dn3:9092");
        props.put("acks", "all");
        props.put("retries", 1);//重试次数
        props.put("batch.size", 16384);//批次大小
        props.put("linger.ms", 1);//等待时间
        props.put("buffer.memory", 33554432);//RecordAccumulator 缓冲区大小
        props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = new KafkaProducer<>(props);

        for (int i = 0; i < upKafkaEntityList.size(); i++) {
            producer.send(new ProducerRecord<String, String>("first",
                    Integer.toString(i), upKafkaEntityList.toString()), new Callback() {
                //回调函数， 该方法会在 Producer 收到 ack 时调用，为异步调用
                @Override
                public void onCompletion(RecordMetadata metadata,
                                         Exception exception) {
                    if (exception == null) {
                        System.out.println("数据发送成功->>>>>>>>>>>>" );
                    } else {
                        System.out.println("数据发送产生错误。。。。。。");
                        exception.printStackTrace();
                    }
                }
            });
        }
        producer.close();

        return true;


    }
}
