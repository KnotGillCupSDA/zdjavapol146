package com.sda.advanced.solution.zad8;

public class Parcel {
	private final int xLength;
	private final int yLength;
	private final int zLength;
	private final float weight;
	private final boolean isExpress;

	public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
		this.xLength = xLength;
		this.yLength = yLength;
		this.zLength = zLength;
		this.weight = weight;
		this.isExpress = isExpress;
	}

	public int getXLength() {
		return xLength;
	}

	public int getYLength() {
		return yLength;
	}

	public int getZLength() {
		return zLength;
	}

	public float getWeight() {
		return weight;
	}

	public boolean isExpress() {
		return isExpress;
	}

}