package com.udacity.vehicles.domain.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.udacity.vehicles.domain.Condition;
import com.udacity.vehicles.domain.Location;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Declares the Car class, related variables and methods.
 */
@Setter @Getter @NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)

public class Car {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name="createdat")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name="modifiedat")
    private LocalDateTime modifiedAt;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Condition condition;

    @Valid
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="body", column=@Column(name="details_body")),
            @AttributeOverride(name="model", column=@Column(name="details_model"))
    })
    private Details details = new Details();

    @Valid
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="lat", column=@Column(name="location_lat")),
            @AttributeOverride(name="lon", column=@Column(name="location_lon"))
    })
    private Location location = new Location(0d, 0d);

    @Transient
    private String price;

}
