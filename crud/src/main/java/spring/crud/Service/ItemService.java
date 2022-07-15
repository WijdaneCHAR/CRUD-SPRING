package spring.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.crud.Exception.ItemNotFoundException;
import spring.crud.Model.Item;
import spring.crud.Repository.API.ItemRepositoryApi;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepositoryApi itemRepositoryApi;

    @Autowired
    public ItemService(ItemRepositoryApi itemRepositoryApi) {
        this.itemRepositoryApi = itemRepositoryApi;
    }

    //Lister
    public List<Item> findAllItems(){
        return itemRepositoryApi.findAll();
    }

    //Ajouter
    public Item addItem(Item item){ return itemRepositoryApi.save(item);}

    //Supprimer
    public void deleteAll(){ itemRepositoryApi.deleteAll();}
    public void deleteItem(Item item){  itemRepositoryApi.delete(item);}
    public void deleteItemById(int id){  itemRepositoryApi.deleteById(id);}

    //Trouver
    public Item findById(int id){ return itemRepositoryApi.findById(id).orElseThrow(() -> new ItemNotFoundException("Article of id " + id + " not found"));}

    //Update
}
