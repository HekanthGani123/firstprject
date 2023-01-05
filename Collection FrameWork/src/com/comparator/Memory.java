package com.comparator;

public class Memory {
	
	private int id;
	private String drive;
	private int size;
	private String memoryType;
	
	public Memory(int id, String drive, int size, String memoryType) {
		super();
		this.id = id;
		this.drive = drive;
		this.size = size;
		this.memoryType = memoryType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}

	@Override
	public String toString() {
		return "Memory [id=" + id + ", drive=" + drive + ", size=" + size + ", memoryType=" + memoryType + "]";
	}
	
	
	

}
