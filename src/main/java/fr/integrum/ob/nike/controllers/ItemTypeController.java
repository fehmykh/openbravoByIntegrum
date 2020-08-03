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

import fr.integrum.ob.nike.repositories.ItemTypeRepository;
import fr.integrum.ob.nike.retailmodels.ItemType;

@RestController
@RequestMapping(value = "/nk")
public class ItemTypeController {
	
	private static Logger LOG = LoggerFactory.getLogger(ItemTypeController.class);

	@Autowired
	private ItemTypeRepository itemTypeRepository;
	
	@GetMapping("/itemTypes")
    public Page<ItemType> getItemTypes(Pageable pageable) {
        return itemTypeRepository.findAll(pageable);
    }
	
	@PostMapping("/itemTypes")
    public ItemType createItemType(@Validated @RequestBody ItemType itemType) {
		LOG.info("ItemType created. ");
        return itemTypeRepository.save(itemType);
    }

}
