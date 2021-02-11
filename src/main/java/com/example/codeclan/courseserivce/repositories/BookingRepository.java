package com.example.codeclan.courseserivce.repositories;

import com.example.codeclan.courseserivce.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
