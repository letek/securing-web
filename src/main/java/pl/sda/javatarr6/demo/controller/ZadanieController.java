package pl.sda.javatarr6.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sda.javatarr6.demo.dto.ZadanieDto;
import pl.sda.javatarr6.demo.service.ZadaniaService;

import java.util.List;


@Controller
public class ZadanieController<ZadaniaDto> {

    @Autowired
    private ZadaniaService zadaniaService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    //@ResponseBody
    public String main(Model model) {

        List<ZadanieDto> zadania = zadaniaService.getAll();

        model.addAttribute("zadania", zadania);

        return "main";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    //@ResponseBody
    public String test() {


        String cos = "eajfwrevoiuehr";
        System.out.println("sout z controlera test "+cos);

        //return "testz controllera "+cos;
        return "test";
    }
}

