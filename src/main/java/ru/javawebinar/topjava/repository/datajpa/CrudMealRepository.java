package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.List;

@Transactional(readOnly = true)
public interface CrudMealRepository extends JpaRepository<Meal, Integer> {
    @Transactional
    @Modifying
    int deleteByIdAndUserId (int id, int userId);

    List<Meal> findMealsByUserIdOrderByDateTimeDesc (int userId);

    Meal findMealByIdAndUserId(int id, int userId);

    List<Meal> findMealsByDateTimeIsAfterAndDateTimeBeforeAndUserIdOrderByDateTimeDesc (LocalDateTime startDateTime, LocalDateTime endDateTime, int userId) ;
}
