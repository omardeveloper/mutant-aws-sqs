package com.meli.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import com.meli.cloud.model.DnaMutation;
import com.meli.cloud.repository.DnaMutationRepository;

@Service
public class SqsReceiver {

  @Autowired
  RedisService redisService;

  @SqsListener("mutant-cache-details")
  public void userCacheListener(DnaMutation dnaMutation) {
    System.out.println("Received Message for dna..." + dnaMutation.getIdDna());

    redisService.save(dnaMutation);
    System.out.println("Save Message in Cache");
  }
}
