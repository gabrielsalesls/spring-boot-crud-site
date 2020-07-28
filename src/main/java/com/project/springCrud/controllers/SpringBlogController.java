package com.project.springCrud.controllers;

import com.project.springCrud.model.Produto;
import com.project.springCrud.services.ProdutoService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SpringBlogController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping(value = "/")
    String getIndex() {
        return "index";
    }

    @GetMapping(value = "/produtos")
    public ModelAndView getAllProdutos(){
        ModelAndView mv = new ModelAndView("produtos");
        List<Produto> produtos = produtoService.findAll();
        mv.addObject("produtos", produtos);
        return mv;
    }

    @GetMapping(value = "/produto/{id}")
    public ModelAndView getProdutoDetails(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("produto");
        Produto produto = produtoService.getById(id);
        mv.addObject("produto", produto);
        return mv;
    }

    @GetMapping(value = "/novoproduto")
    public String novoProduto(){
        return "produtoform";
    }

    @PostMapping(value = "/novoproduto")
    public String salvarProduto(@Valid Produto produto, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagemErro", "Preencha todos os campos obrigatorios");
            return "redirect:/novoproduto";
        }

        produtoService.save(produto);
        return "redirect:/produto/" + produto.getId();
    }

    @RequestMapping("/produto/editar/{id}")
    public ModelAndView editarProdutoForm(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("produtoedit");
        Produto produto = produtoService.getById(id);
        mv.addObject("produto", produto);
        return mv;
    }

    @PostMapping("/produto/editar/{id}")
    public String editarProduto(@PathVariable("id") long id,@Valid Produto produto,
                                BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagemErro", "Preencha todos os campos obrigatorios");
            return "redirect:/produto/editar/"+ produto.getId();
        }
        produtoService.save(produto);
        return "redirect:/produtos";
    }

    @RequestMapping("/produto/delete/{id}")
    public String delete(@PathVariable long id) {
        produtoService.deleteProduto(id);
        return "redirect:/produtos";
    }
}

