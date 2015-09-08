package br.unip.dsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by dirceu on 9/3/15.
 */
@Controller
@RequestMapping("/primeiro")
public class PrimeiroController {

    @RequestMapping(method = RequestMethod.GET)
    public String imprimeOla(ModelMap model) {
        model.addAttribute("mensagem", "Olá seu primeiro MVC!");

        return "primeiro";
    }
    @RequestMapping("/index")
    public String Oola() {
//        model.addAttribute("name", name);
        return "index";
    }
}