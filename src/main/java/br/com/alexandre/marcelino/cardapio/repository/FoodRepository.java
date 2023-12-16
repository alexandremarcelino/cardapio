package br.com.alexandre.marcelino.cardapio.repository;

import br.com.alexandre.marcelino.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
