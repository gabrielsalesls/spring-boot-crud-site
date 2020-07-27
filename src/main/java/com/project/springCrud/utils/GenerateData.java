package com.project.springCrud.utils;

import com.project.springCrud.model.Produto;
import com.project.springCrud.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class GenerateData {

    @Autowired
    ProdutoRepository produtoRepository;

    //@PostConstruct
    public void saveProdutos(){
        List<Produto> produtoList = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setPreco(new BigDecimal("3000"));
        produto1.setProdutoId("10");
        //produto1.setVersion(1);

        Produto produto2 = new Produto();
        produto2.setNome("Celular");
        produto2.setPreco(new BigDecimal("1400"));
        produto2.setProdutoId("11");
        //produto2.setVersion(1);

        produtoList.add(produto1);
        produtoList.add(produto2);

        for(Produto produto : produtoList){
            Produto produtoSalvo = produtoRepository.save(produto);
            System.out.println(produtoSalvo.getId());
        }

    }
}
