package io.github.bragamateus.pontocontrole.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, Long> {


        @Override
        public Long convertToDatabaseColumn(Duration attribute) {
            return attribute.toSeconds();
        }

        @Override
        public Duration convertToEntityAttribute(Long duration) {
            return Duration.of(duration, ChronoUnit.SECONDS);
        }

}
