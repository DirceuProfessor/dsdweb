package br.unip.dsd.controller;

import br.unip.dsd.modelos.Usuario;
import br.unip.dsd.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dirceu on 9/7/15.
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private RepositorioUsuario usuRepo;


    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@ModelAttribute("usuario") Usuario usuario){

            this.usuRepo.saveAndFlush(usuario);

        return "redirect:/usuario";

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String removePerson(@PathVariable("id") long id){

        this.usuRepo.delete(id);
        return "redirect:/usuario";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String editPerson(@PathVariable("id") long id, Model model){
        model.addAttribute("usuario", this.usuRepo.findById(id));
//        ?model.addAttribute("listPersons", this.usuRepo.listPersons());
        return "usuario";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String editPerson(Model model){
//        model.addAttribute("usuario", this.usuRepo.findById(id));
//        ?model.addAttribute("listPersons", this.usuRepo.listPersons());
        return "usuario";
    }
}
