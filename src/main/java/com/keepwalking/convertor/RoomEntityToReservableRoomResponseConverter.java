package com.keepwalking.convertor;

import com.keepwalking.Entity.RoomEntity;
import com.keepwalking.model.Links;
import com.keepwalking.model.Self;
import com.keepwalking.model.response.ReservableRoomResponse;
import com.keepwalking.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;

public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

	@Override
	public ReservableRoomResponse convert(RoomEntity source) {
		// TODO Auto-generated method stub
		
		ReservableRoomResponse reservationResponse = new ReservableRoomResponse();
		if(null != source.getId())
			reservationResponse.setId(source.getId());
		reservationResponse.setRoomNumber(source.getRoomNumber());
		reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );
		
		Links links = new Links();
		Self self = new Self();
		self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
		links.setSelf(self);
		
		reservationResponse.setLinks(links);
		
		return reservationResponse;
	}

	
	
}
