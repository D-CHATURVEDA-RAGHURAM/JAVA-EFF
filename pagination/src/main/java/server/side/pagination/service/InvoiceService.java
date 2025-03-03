package server.side.pagination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import server.side.pagination.entity.Invoice;
import server.side.pagination.repo.InvoiceRepository;

@Service
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public Page<Invoice> getInvoices(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());
        return invoiceRepository.findAll(pageable);
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    
    public List<Invoice> createInvoices(List<Invoice> invoices) {
        return invoiceRepository.saveAll(invoices);
    }
    
    public Page<Invoice> getInvoices(int page, int size, String sortBy, String direction) {
        Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return invoiceRepository.findAll(pageable);
    }

    public Optional<Invoice> getInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}
