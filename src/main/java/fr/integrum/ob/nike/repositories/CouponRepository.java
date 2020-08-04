package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String>{

}
