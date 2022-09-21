package br.com.mercadolele.appmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mercadolele.appmercado.model.Produto;
import br.com.mercadolele.appmercado.repo.ProdutoRepo;

@Component // consigo injetar a implementacao do produto service impl dentro de qualquer chamado
public class ProdutoServiceImpl implements IProdutoService {
	
	@Autowired //ja to chamando o meu repositorio
	private ProdutoRepo repo;
	@Override
	public Produto criarNovoProduto(Produto prod) {
		// TODO Auto-generated method stub
		return repo.save(prod);
	}

	@Override
	public Produto alterarProduto(Produto prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> buscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
