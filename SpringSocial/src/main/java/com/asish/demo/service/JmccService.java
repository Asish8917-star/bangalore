package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import com.asish.demo.entity.Jmcc_Patrapur;

public interface JmccService {
	public List<Jmcc_Patrapur> getAll();
	public Optional<Jmcc_Patrapur> getById(int id);
	public Jmcc_Patrapur create(Jmcc_Patrapur jm);
	public Jmcc_Patrapur update(Jmcc_Patrapur jm);
	public void delete(int id);

}
