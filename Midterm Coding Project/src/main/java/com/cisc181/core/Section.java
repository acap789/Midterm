package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID CourseID;
	private UUID SectionID;
	private UUID SemesterID;
	private int RoomID;

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void serRoomID(int roomid) {
		RoomID = roomid;
	}

}
