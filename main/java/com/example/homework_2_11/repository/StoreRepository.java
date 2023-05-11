package com.example.homework_2_11.repository;

import com.example.homework_2_11.model.Item;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> store = new HashMap<>();
    @PostConstruct
    public void init(){
        store.put(idCounter, new Item(idCounter++, "Рубашка"));
        store.put(idCounter, new Item(idCounter++, "Брюки"));
        store.put(idCounter, new Item(idCounter++, "Юбка"));
    }
    public void add(Item item){
        store.put(item.getId(), item);
    }
    public Item get (int id){
        return store.get(id);
    }
    public List<Item> getAll(){
        return new ArrayList<>(store.values());
    }
    public void update(int id, Item item){
        if (store.containsKey(id)){
            store.replace(id, item);
        }
    }
    public Item delete (int id) {
        return store.remove(id);
    }

}
