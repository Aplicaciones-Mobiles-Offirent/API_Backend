package com.acme.offirent.resource;

import com.acme.offirent.domain.model.Office;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationResource {

    private Long id;
    private boolean status;
    private Date initialDate;
    private Date endDate;

    private Long officeId;
}
