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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.VoucherRepository;
import fr.integrum.ob.nike.retailmodels.Voucher;

@RestController
@RequestMapping(value = "/nk")
public class VoucherController {
	
	private static Logger LOG = LoggerFactory.getLogger(VoucherController.class);

	@Autowired
	private VoucherRepository voucherRepository;
	
	@GetMapping("/vouchers")
    public Page<Voucher> getVouchers(Pageable pageable) {
        return voucherRepository.findAll(pageable);
    }
	
	@PostMapping("/vouchers")
    public Voucher createVoucher(@Validated @RequestBody Voucher voucher) {
		LOG.info("Voucher created. ");
        return voucherRepository.save(voucher);
    }

}
