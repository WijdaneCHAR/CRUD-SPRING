package spring.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public List<Item> findAllItems(){
        return itemRepositoryApi.findAll();
    }
}
