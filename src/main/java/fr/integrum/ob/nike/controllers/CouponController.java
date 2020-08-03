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

import fr.integrum.ob.nike.repositories.CouponRepository;
import fr.integrum.ob.nike.retailmodels.Coupon;

@RestController
@RequestMapping(value = "/nk")
public class CouponController {
	
	private static Logger LOG = LoggerFactory.getLogger(CouponController.class);

	@Autowired
	private CouponRepository couponRepository;
	
	@GetMapping("/coupons")
    public Page<Coupon> getCoupons(Pageable pageable) {
        return couponRepository.findAll(pageable);
    }
	
	@PostMapping("/coupons")
    public Coupon createCoupon(@Validated @RequestBody Coupon coupon) {
		LOG.info("Coupon created. ");
        return couponRepository.save(coupon);
    }

}
