package spring.crud.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.crud.Model.Item;
import spring.crud.Service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Item>> getItems(){
        return new ResponseEntity<>(itemService.findAllItems(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        return new ResponseEntity<>(itemService.addItem(item),HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Item> findItem(@PathVariable("id") int id){
        return new ResponseEntity<>(itemService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteItem(@PathVariable("id") int id) {
        itemService.deleteItemById(id);
        return true;
    }
    @DeleteMapping("/delete")
    public void deleteAll() {
        itemService.deleteAll();
    }
}
