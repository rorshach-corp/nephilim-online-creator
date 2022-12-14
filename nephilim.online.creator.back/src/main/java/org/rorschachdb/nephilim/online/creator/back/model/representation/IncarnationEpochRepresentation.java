package org.rorschachdb.nephilim.online.creator.back.model.representation;

import jakarta.validation.constraints.*;
import lombok.*;
import org.rorschachdb.nephilim.online.creator.back.model.embedded.MagicEffect;
import org.rorschachdb.nephilim.online.creator.back.model.embedded.TimePeriod;
import org.rorschachdb.nephilim.online.creator.back.model.enums.EraEnum;

import java.util.Set;

/**
 * Representation of {@link org.rorschachdb.nephilim.online.creator.back.model.entities.IncarnationEpoch}
 * TODO consider hateoas
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncarnationEpochRepresentation {
    private Long id;

    /**
     * IncarnationEpoch's designation - conceptual key
     */
    @NotBlank
    private String name;

    /**
     * IncarnationEpoch's summary : context, events, people...
     */
    private String description;

    /**
     * Price in incarnation points for a character to acquire an IncarnationEpoch
     */
    @Max(2)
    @PositiveOrZero
    private Integer cost;

    /**
     * Group of incarnation epochs which the IncarnationEpoch is part of
     */
    @NotNull
    private EraEnum era;

    /**
     * List of geographical loci where the IncarnationEpoch takes place
     */
    @NotEmpty
    @Singular
    private Set<String> locations;

    @NotEmpty
    @Singular
    private Set<MagicEffect> magicEffects;

    private TimePeriod timePeriod;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Singular
    private Set<IncarnationEpochDegreeValueRepresentation> degreeValues;

}
