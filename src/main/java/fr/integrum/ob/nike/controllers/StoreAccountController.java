package fr.integrum.ob.nike.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.StoreAccountRepository;
import fr.integrum.ob.nike.retailmodels.StoreAccount;

@RestController
public class StoreAccountController {
	
	private static Logger LOG = LoggerFactory.getLogger(StoreAccountController.class);

	@Autowired
	private StoreAccountRepository storeAccountRepository;
	
	@GetMapping("/storeAccounts")
    public Page<StoreAccount> getStoreAccounts(Pageable pageable) {
        return storeAccountRepository.findAll(pageable);
    }
	
	@PostMapping("/storeAccounts")
    public StoreAccount createStoreAccount(@Validated @RequestBody StoreAccount storeAccount) {
		LOG.info("StoreAccount created. ");
        return storeAccountRepository.save(storeAccount);
    }

}
