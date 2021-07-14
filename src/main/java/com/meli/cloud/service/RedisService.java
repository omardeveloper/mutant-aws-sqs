package com.meli.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meli.cloud.model.DnaMutation;
import com.meli.cloud.repository.DnaMutationRepository;

import java.util.List;
import java.util.Map;

@Service
public class RedisService {

	@Autowired
	DnaMutationRepository dnaMutationRepository;

	/**
	 * This Method search for dna
	 * 
	 * @param dna
	 * @return DnaMutation
	 */
	public DnaMutation getByIdDna(String idDna) {
		return dnaMutationRepository.findByIdDna(idDna);
	}

	/**
	 * This Method get all data of redis
	 * 
	 * @return list of DnaMutation
	 */
	public List<DnaMutation> findAll() {
		return dnaMutationRepository.findAll();
	}

	/**
	 * This Method save the data of dna
	 * 
	 * @param dnaMutation
	 */
	public void save(DnaMutation dnaMutation) {
		dnaMutationRepository.save(dnaMutation);
	}
}
