package com.medinova.events;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record EmailRequestedEvent(
  UUID eventId,
  String recipient,
  String template,
  Map<String, Object> variables,
  Instant occurredAt,
  String sourceService
) {
}
