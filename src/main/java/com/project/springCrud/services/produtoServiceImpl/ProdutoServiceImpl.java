package com.project.springCrud.services.produtoServiceImpl;

import com.project.springCrud.model.Produto;
import com.project.springCrud.repositories.ProdutoRepository;
import com.project.springCrud.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getById(Long id) {
        //return produtoRepository.findById(id);
        return produtoRepository.findById(id).orElse(null);
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
