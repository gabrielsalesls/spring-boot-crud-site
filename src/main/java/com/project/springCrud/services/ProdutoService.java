package com.project.springCrud.services;

import com.project.springCrud.model.Produto;

import java.util.List;


public interface ProdutoService {

    List<Produto> findAll();

    Produto getById(Long id);

    Produto save(Produto produto);

    void deleteProduto(Long id);


}
