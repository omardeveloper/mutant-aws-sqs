package com.meli.cloud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.meli.cloud.model.DnaMutation;

import java.util.List;
import java.util.Map;

@Repository
public class DnaMutationRepositoryImpl implements DnaMutationRepository {

	public static final String HASH_KEY = "mutationcache";

	@Autowired
	private RedisTemplate redisTemplate;
	
//	@Autowired
//	private HashOperations hashOperations;
//	private RedisTemplate<String, DnaMutation> redisTemplate;
//	private HashOperations hashOperations;

//	public DnaMutationRepositoryImpl(RedisTemplate<String, DnaMutation> redisTemplate) {
//		this.redisTemplate = redisTemplate;
//		hashOperations = redisTemplate.opsForHash();
//	}

	@Override
	public void save(DnaMutation dnaMutation) {
		redisTemplate.opsForHash().put(HASH_KEY, dnaMutation.getIdDna(), dnaMutation);
	}

	@Override
	public Map<String, DnaMutation> findAll() {
		return (Map<String, DnaMutation>) redisTemplate.opsForHash().entries(HASH_KEY);
	}

	@Override
	public DnaMutation findByIdDna(String idDna) {
		return (DnaMutation) redisTemplate.opsForHash().get(HASH_KEY,idDna);
	}

}