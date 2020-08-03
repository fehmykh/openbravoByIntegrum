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

import fr.integrum.ob.nike.repositories.ItemRepository;
import fr.integrum.ob.nike.retailmodels.Item;

@RestController
@RequestMapping(value = "/nk")
public class ItemController {
	
	private static Logger LOG = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/items")
    public Page<Item> getItems(Pageable pageable) {
        return itemRepository.findAll(pageable);
    }
	
	@PostMapping("/items")
    public Item createItem(@Validated @RequestBody Item item) {
		LOG.info("Item created. ");
        return itemRepository.save(item);
    }

}
