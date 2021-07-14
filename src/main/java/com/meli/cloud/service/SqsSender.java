package com.meli.cloud.service;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.meli.cloud.model.DnaMutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SqsSender {

  private QueueMessagingTemplate queueMessagingTemplate;

  public SqsSender(AmazonSQSAsync amazonSQSAsync) {
    this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync);
  }

  public void send(DnaMutation dnaMutation) {
    System.out.println("Sending dna to SQS..." + dnaMutation.getIdDna());
    queueMessagingTemplate.convertAndSend("mutant-cache-details", dnaMutation);
  }
}
