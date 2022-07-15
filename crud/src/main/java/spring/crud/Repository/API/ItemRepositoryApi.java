package spring.crud.Repository.API;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.crud.Model.Item;

@Repository
public interface ItemRepositoryApi extends JpaRepository<Item,Integer> {
}
