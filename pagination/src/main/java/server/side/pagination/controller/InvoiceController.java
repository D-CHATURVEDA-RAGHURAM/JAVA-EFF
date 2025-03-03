package server.side.pagination.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import server.side.pagination.entity.Invoice;
import server.side.pagination.service.InvoiceService;

@RestController
@RequestMapping("/invoices")
@RequiredArgsConstructor

public class InvoiceController {
    private final InvoiceService invoiceService;

    @GetMapping("/all")
    public ResponseEntity<Page<Invoice>> getInvoices(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "bookingId") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {
        
        Page<Invoice> invoices = invoiceService.getInvoices(page, size, sortBy, direction);
        return ResponseEntity.ok(invoices);
    }


    @PostMapping("/insert")
    public ResponseEntity<?> createInvoice(@RequestBody Object requestBody) {
        ObjectMapper objectMapper = new ObjectMapper();
        
        if (requestBody instanceof List) {
            // Convert List of LinkedHashMaps to List of Invoice objects
            List<Invoice> invoices = objectMapper.convertValue(requestBody, new TypeReference<List<Invoice>>() {});
            return ResponseEntity.ok(invoiceService.createInvoices(invoices));
        } else {
            // Convert single LinkedHashMap to Invoice object
            Invoice invoice = objectMapper.convertValue(requestBody, Invoice.class);
            return ResponseEntity.ok(invoiceService.createInvoice(invoice));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoice(@PathVariable Long id) {
        return invoiceService.getInvoiceById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoice(id);
        return ResponseEntity.noContent().build();
    }
}
