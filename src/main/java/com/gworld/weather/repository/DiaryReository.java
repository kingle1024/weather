package com.gworld.weather.repository;

import com.gworld.weather.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

public interface DiaryReository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByDate(LocalDate date);
    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);
    Diary getFirstByDate(LocalDate date);
    @Transactional
    void deleteAllByDate(LocalDate date);
}
