package controller;
 import model.PagoNomina;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import service.PagoNominaService;

 @Controller
 @RequestMapping("/app/api/v1/pago")
 public class PagoNominaController {
     private final PagoNominaService pagoNominaService;

     @Autowired
     public PagoNominaController(PagoNominaService pagoNominaService) {
         this.pagoNominaService = pagoNominaService;
     }

     @RequestMapping(value = "get/all", method = RequestMethod.GET)
     public PagoNomina[] getAllPayments() {
         return pagoNominaService.getAllPayments();
     }

     /*
     * package controller;
 import model.PagoNomina;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import service.PagoNominaService;

 @Controller
 @RequestMapping("/app/api/v1/pago")
 public class PagoNominaController {
     private final PagoNominaService pagoNominaService;

     @Autowired
     public PagoNominaController(PagoNominaService pagoNominaService) {
         this.pagoNominaService = pagoNominaService;
     }

     @RequestMapping(value = "get/all", method = RequestMethod.GET)
     public PagoNomina[] getAllPayments() {
         return pagoNominaService.getAllPayments();
     }
     *
     * */
 }
