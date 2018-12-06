package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.ParkingSlot;
import com.model.Vehicle;

public class ParkinglotService {

	private static int NO_OF_SLOTS = 0;
	private static List<ParkingSlot> slotList = new ArrayList<ParkingSlot>();
	
	public static void loadSlots(int num){
		NO_OF_SLOTS = num;
		for(int i =0;i<NO_OF_SLOTS;i++) {
			slotList.add(new ParkingSlot(i));
		}
	}
	
	public int parkVehicle(Vehicle vehicle){
		ParkingSlot slot = getFirstAvailableSlot();
		
	}
	
	
	public ParkingSlot getFirstAvailableSlot(){
		ParkingSlot slot = null;
		Iterator<ParkingSlot> it = slotList.iterator();
		while(it.hasNext()) {
			slot = it.next();
			if(!slot.isOccupied()) {
				break;
			}
		}
		return slot;	
	}
	
}
