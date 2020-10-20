package pl.sda.javatarr6.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sda.javatarr6.demo.service.ZadanieService;

import java.util.List;


@Controller
public class ZadanieController<ZadanieDto> {

    @Autowired
    private ZadanieService zadanieService;


    //    @RequestMapping(value = "/main", method = RequestMethod.GET)
//    //@ResponseBody
//    public String main(Model model) {
//
//        //List<pl.sda.javatarr6.demo.dto.ZadanieDto> zad = zadanieService.getAll();
//                //zadanieService.getAll();
//
//        model.addAttribute("main", zadanieService.getAll());
//
//        return "main";
//    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)

    public String main2(Model model) {

        List<pl.sda.javatarr6.demo.dto.ZadanieDto> zadania = zadanieService.getAll();

        model.addAttribute("zadania", zadania);

        return "main2";
    }


    @RequestMapping(value = "/zadanieList", method = RequestMethod.GET)
    //@ResponseBody
    public String zadanieList(Model model) {

        List<pl.sda.javatarr6.demo.dto.ZadanieDto> zadania= zadanieService.getAll();

        model.addAttribute("zadanieList", zadania);

        return "zadanieList";
    //    return model.toString();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    //@GetMapping("/hello")
    //@ResponseBody
    public String test() {


        String cos = "eajfwrevoiuehr";
        System.out.println("sout z controlera test " + cos);

        //return "testz controllera "+cos;
        return "test";
    }

    @RequestMapping(value = "/addzadanie", method = RequestMethod.GET)
    public String createQuiz(Model model) {

        model.addAttribute("zadanie", new pl.sda.javatarr6.demo.dto.ZadanieDto());

        return "/addzadanie";
    }

    @RequestMapping(value = "/addzadanie", method = RequestMethod.POST)
    public String createZadanie(@ModelAttribute("zadanie") @Validated pl.sda.javatarr6.demo.dto.ZadanieDto zadanieDto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "/addzadanie";
        }

        //zadanieDto.setOpis();
        zadanieService.save(zadanieDto);

        return "redirect:/main";
    }
}

