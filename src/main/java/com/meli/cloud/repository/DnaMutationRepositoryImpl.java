package com.meli.cloud.repository;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.meli.cloud.model.DnaMutation;

import java.util.List;
import java.util.Map;

@Repository
public class DnaMutationRepositoryImpl implements DnaMutationRepository {

	public static final String HASH_KEY = "mutationcache";

	private RedisTemplate<String, DnaMutation> redisTemplate;
	private HashOperations hashOperations;

	public DnaMutationRepositoryImpl(RedisTemplate<String, DnaMutation> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(DnaMutation dnaMutation) {
		hashOperations.put(HASH_KEY, dnaMutation.getIdDna(), dnaMutation);
	}

	@Override
	public List<DnaMutation> findAll() {
		return (List<DnaMutation>)hashOperations.entries(HASH_KEY);
	}

	@Override
	public DnaMutation findByIdDna(String idDna) {
		return (DnaMutation) hashOperations.get(HASH_KEY,idDna);
	}

}