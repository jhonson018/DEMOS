package service;

import lombok.extern.slf4j.Slf4j;
import model.PagoNomina;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PagoNominaService {

    private static final Logger log = LoggerFactory.getLogger(PagoNominaService.class);
    private final String API_URL = "http://localhost:8081/unapec/api/v1/payment/";

    private final RestTemplate restTemplate;

    public PagoNominaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PagoNomina[] getAllPayments() {
        log.info("Make request...");
        return restTemplate.getForObject(API_URL, PagoNomina[].class);
    }

}

