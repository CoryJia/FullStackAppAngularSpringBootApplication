package com.keepwalking.convertor;


import com.keepwalking.Entity.ReservationEntity;
import com.keepwalking.model.request.ReservationRequest;
import org.springframework.core.convert.converter.Converter;

public class ReservationRequestToReservationEntityConverter implements Converter<ReservationRequest, ReservationEntity> {

    @Override
    public ReservationEntity convert(ReservationRequest source) {

        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setCheckin(source.getCheckin());
        reservationEntity.setCheckout(source.getCheckout());
        if (null != source.getId())
            reservationEntity.setId(source.getId());

        return reservationEntity;
    }
}