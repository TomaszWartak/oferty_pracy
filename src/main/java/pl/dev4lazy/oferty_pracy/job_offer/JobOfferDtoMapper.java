package pl.dev4lazy.oferty_pracy.job_offer;

import org.springframework.stereotype.Service;
import pl.dev4lazy.oferty_pracy.company.Company;
import pl.dev4lazy.oferty_pracy.company.CompanyRepository;

@Service
class JobOfferDtoMapper {
    private CompanyRepository companyRepository;

    public JobOfferDtoMapper(CompanyRepository companyRepository) {
         this.companyRepository = companyRepository;
    }
    JobOfferDto map(JobOffer jobOffer) {
        JobOfferDto dto = new JobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setDescription(jobOffer.getDescription());
        dto.setRequirements(jobOffer.getRequirements());
        dto.setDuties(jobOffer.getDuties());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        dto.setDateAdded(jobOffer.getDateAdded());
        dto.setCompanyId(jobOffer.getCompany().getId());
        dto.setCompanyName(jobOffer.getCompany().getName());
        return dto;
    }

    JobOffer map(JobOfferDto jobOfferDto) {
        JobOffer jobOffer = new JobOffer();
        jobOffer.setId(jobOfferDto.getId());
        jobOffer.setTitle(jobOfferDto.getTitle());
        jobOffer.setDescription(jobOfferDto.getDescription());
        jobOffer.setRequirements(jobOfferDto.getRequirements());
        jobOffer.setDuties(jobOfferDto.getDuties());
        jobOffer.setLocation(jobOfferDto.getLocation());
        jobOffer.setMinSalary(jobOfferDto.getMinSalary());
        jobOffer.setMaxSalary(jobOfferDto.getMaxSalary());
        jobOffer.setDateAdded(jobOfferDto.getDateAdded());
        Company company = companyRepository.findById(jobOfferDto.getCompanyId()).orElseThrow();
        jobOffer.setCompany(company);

        return jobOffer;
    }
}

