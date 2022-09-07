package com.gworld.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name = "date_weather")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DateWeather {
    @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private Double temperatur;
}
