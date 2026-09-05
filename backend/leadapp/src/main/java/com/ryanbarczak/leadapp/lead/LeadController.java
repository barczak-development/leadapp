package com.ryanbarczak.leadapp.lead;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    @GetMapping
    public List<Lead> getLeads() {
        return LeadService.getAllLeads();
    }

    @GetMapping("/{id}")
    public Lead getLeadById(long id) {
        return LeadService.getLeadById(id);
    }

    @PostMapping
    public Lead createLead(Lead lead) {
        return LeadService.createLead(lead);
    }

    @DeleteMapping("/{id}")
    public void deleteLead(long id) {
        LeadService.deleteLead(id);
    }


}