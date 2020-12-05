package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asish.demo.entity.Jmcc_Patrapur;
import com.asish.demo.repository.JmccRepository;
@Service
public class JmccServiceImpl implements JmccService {
	@Autowired
	private JmccRepository repo;

	@Override
	public List<Jmcc_Patrapur> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Jmcc_Patrapur> getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Jmcc_Patrapur create(Jmcc_Patrapur jm) {
		// TODO Auto-generated method stub
		return repo.save(jm);
	}

	@Override
	public Jmcc_Patrapur update(Jmcc_Patrapur jm) {
		// TODO Auto-generated method stub
		return repo.save(jm);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
