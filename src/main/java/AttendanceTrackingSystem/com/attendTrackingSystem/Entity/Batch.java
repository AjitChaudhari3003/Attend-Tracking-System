package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import java.time.LocalDateTime;

public class Batch {
	
	private int batchId;
	private String batchName;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, String batchName, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	
	

}
