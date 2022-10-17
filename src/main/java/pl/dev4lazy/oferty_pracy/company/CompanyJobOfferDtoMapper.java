package pl.dev4lazy.oferty_pracy.company;

import org.springframework.stereotype.Service;
import pl.dev4lazy.oferty_pracy.job_offer.JobOffer;

@Service
class CompanyJobOfferDtoMapper {
    CompanyJobOfferDto map(JobOffer jobOffer) {
        CompanyJobOfferDto dto = new CompanyJobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        return dto;
    }
}

