package com.meli.cloud.repository;

import java.util.List;
import java.util.Map;

import com.meli.cloud.model.DnaMutation;

public interface DnaMutationRepository {

  void save(DnaMutation dnaMutation);
  List<DnaMutation> findAll();
  DnaMutation findByIdDna(String idDna);
}
