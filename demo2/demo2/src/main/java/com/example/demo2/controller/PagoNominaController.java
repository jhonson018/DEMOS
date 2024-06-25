package com.example.demo2.controller;
 import com.example.demo2.model.PagoNomina;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import com.example.demo2.service.PagoNominaService;
 import org.springframework.web.client.RestTemplate;

 import java.util.List;

@Controller
 @RequestMapping("/app/api/v1/pago")
 public class PagoNominaController {
     private final PagoNominaService pagoNominaService;
     @Autowired
     private RestTemplate restTemplate;

     @Autowired
     public PagoNominaController(PagoNominaService pagoNominaService) {
         this.pagoNominaService = pagoNominaService;
     }

     @RequestMapping(value = "get/all", method = RequestMethod.GET)
     public PagoNomina[] getAllPayments() {
         return pagoNominaService.getAllPayments();
     }
    @GetMapping("/pagos")
    public String getPagosView(Model model) {
        String url = "http://localhost:8081/unapec/api/v1/payment/";
        List<PagoNomina> pagos = restTemplate.getForObject(url, List.class);
        model.addAttribute("pagos", pagos);
        return "payment";
    }
 }
