package fr.integrum.ob.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.Approval;
import fr.integrum.ob.repositories.ApprovalRepository;

@RestController
@RequestMapping(value = "/ob")
public class ApprovalController {
	
	private static Logger LOG = LoggerFactory.getLogger(ApprovalController.class);

	@Autowired
	private ApprovalRepository approvalRepository;
	
	@GetMapping("/approvals")
    public Page<Approval> getApprovals(Pageable pageable) {
        return approvalRepository.findAll(pageable);
    }
	
	@PostMapping("/approvals")
    public Approval createApproval(@Validated @RequestBody Approval approval) {
		LOG.info("Approval created. ");
        return approvalRepository.save(approval);
    }

}
