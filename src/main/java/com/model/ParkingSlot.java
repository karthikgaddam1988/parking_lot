package com.model;

public class ParkingSlot {

	private boolean isOccupied = false;
	
	private int slotNumber = 0;
	
	
	public ParkingSlot(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	
	public void park() {
		isOccupied = true;
	}
	
	public void unPark() {
		isOccupied = false;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	
}
