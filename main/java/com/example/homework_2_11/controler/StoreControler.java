package com.example.homework_2_11.controler;

import com.example.homework_2_11.model.Item;
import com.example.homework_2_11.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/order")
public class StoreControler {
    private final StoreService storeService;

    public StoreControler(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping(value = "/add")
    public void add(@RequestParam Set<Integer> id){
        storeService.add(id);
    }
    @GetMapping(value = "/get")
    public List<Item> get(){
       return storeService.get();
    }

}
