package com.techagi.microservice.reservationsystem.entity;

public class ReservationInfo {

    private String bookId;
    private String studentId;
    private Long reservationId;

    public ReservationInfo() {
    }

    public ReservationInfo(String studentId, String bookId) {
        this.studentId = studentId;
        this.bookId = bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }
}
