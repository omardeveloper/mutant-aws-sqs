package com.meli.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cloud.aws.cache.config.annotation.CacheClusterConfig;
import org.springframework.cloud.aws.cache.config.annotation.EnableElastiCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.meli.cloud.model.DnaMutation;

@Configuration
@EnableElastiCache({ @CacheClusterConfig(name = "mutationcache") })
public class RedisConfig {

	@Value("${mutant.jedis.server}")
	private String host;

	@Value("${mutant.jedis.port}")
	private Integer port;

	/**
	 * This Method have configuration of JedisConnectionFactory
	 * 
	 * @return JedisConnectionFactory
	 */
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(host, port);
		return new JedisConnectionFactory(redisStandaloneConfiguration);
	}

	/**
	 * This Method have configuration of RedisTemplate
	 * 
	 * @return RedisTemplate
	 */
	@Bean(value = "redisTemplate")
	public RedisTemplate<String, DnaMutation> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
		RedisTemplate<String, DnaMutation> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory);
		return redisTemplate;
	}

	/**
	 * This Method have configuration of CacheManager
	 * 
	 * @return CacheManager
	 */
	@Bean(name = "cacheManager")
	public CacheManager cacheManager(JedisConnectionFactory jedisConnectionFactory) {
		return RedisCacheManager.builder(jedisConnectionFactory)
				.cacheDefaults(RedisCacheConfiguration.defaultCacheConfig()).build();
	}
}