package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMemory {
	public static void main(String[] args) {
		
		Memory m1=new Memory(14, "A", 500, "HardDisk");
		Memory m2=new Memory(1, "D", 32, "penDrive");
		Memory m3=new Memory(5, "C", 4, "DVD");
		
		List<Memory> mem=new ArrayList<>();
		mem.add(m1);
		mem.add(m2);
		mem.add(m3);
		
		Collections.sort(mem, new SizeComparator());
		
		for(Memory m:mem) {
			System.out.println(m);
		}
		
		System.out.println("...............................");
		Collections.sort(mem, new DriveComparator());
		for(Memory m:mem) {
			System.out.println(m);
		}
		
		System.out.println("...............................");
		Comparator<Memory> mem1=Comparator.comparing(Memory::getId);
		Collections.sort(mem, mem1);
		for(Memory m:mem) {
			System.out.println(m);
		}
	}

}
