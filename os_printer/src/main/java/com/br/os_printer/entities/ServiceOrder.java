package com.br.os_printer.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServiceOrder {

    String serviceOrder;
    String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    String codClient;
    String responsible;
    Priority priority;
    String invoice; // notafiscal    


    public ServiceOrder() {
    }


    public ServiceOrder(String serviceOrder, String data, String codClient, String responsible, Priority priority,
            String invoice) {
        this.serviceOrder = serviceOrder;
        this.data = data;
        this.codClient = codClient;
        this.responsible = responsible;
        this.priority = priority;
        this.invoice = invoice;
    }


    public String getServiceOrder() {
        return serviceOrder;
    }
    public void setServiceOrder(String serviceOrder) {
        this.serviceOrder = serviceOrder;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCodClient() {
        return codClient;
    }
    public void setCodClient(String codClient) {
        this.codClient = codClient;
    }
    public String getResponsible() {
        return responsible;
    }
    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public String getInvoice() {
        return invoice;
    }
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }


    


     
    
}
