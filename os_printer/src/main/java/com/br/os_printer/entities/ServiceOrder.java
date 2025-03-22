package main.java.com.br.os_printer.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceOrder {

    String serviceOrder;
    String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String codClient;
    
}
