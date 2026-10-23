package com.gerenciadorPet.repository;

import com.gerenciadorPet.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
