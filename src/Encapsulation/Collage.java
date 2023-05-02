package Encapsulation;

public class Collage {
 private String studentName;
 private int regNo;
 private String semister;
 private int backlog;
 
 public Collage(String studentName, int regNo, String semister, int backlog) {
	 this.studentName=studentName;
	 this.regNo=regNo;
	 this.semister=semister;
	 this.backlog=backlog;
 }
 public String getstudentName() {
	return this.studentName;
 }
 public String getsemister() {
	return this.semister;
 }
 public int getregno() {
	return this.regNo;
 }
 public String getbacklog() {
	return this.studentName;
 }
 public void setstudenName( String studentName) {
	 this.studentName=studentName;
 }
 public void setregNo( int regNo) {
	 this.regNo=regNo;
 }
 public void setsemister( String semister) {
	 this.semister=semister;
 }
 public void setbacklog( int backlog) {
	 this.backlog=backlog;
 }
}
