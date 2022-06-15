package com.faguiar.pontointeligente.api.services.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.faguiar.pontointeligente.api.entities.Lancamento;
import com.faguiar.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Lancamento> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

}
