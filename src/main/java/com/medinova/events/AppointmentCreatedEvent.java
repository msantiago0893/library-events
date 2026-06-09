package com.medinova.events;

import java.time.Instant;
import java.util.UUID;

public record AppointmentCreatedEvent(
  UUID appointmentId,
  UUID patientId,
  UUID doctorId,
  Instant appointmentDate,
  Instant occurredAt
) {
}
