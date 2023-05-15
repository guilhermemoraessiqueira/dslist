package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.*;


public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
