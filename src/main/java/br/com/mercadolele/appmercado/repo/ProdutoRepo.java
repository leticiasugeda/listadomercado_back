package br.com.mercadolele.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.mercadolele.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {

}