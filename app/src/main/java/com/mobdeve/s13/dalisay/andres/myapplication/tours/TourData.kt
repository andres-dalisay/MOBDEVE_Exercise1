package com.mobdeve.s13.dalisay.andres.myapplication.tours

data class TourData(
    val tourCity: String,
    val tourLocation: String,
    val tourDateMonth: String,
    val tourDateDay: String,
    val tourDayOfWeek: String,
    val tourTime: String,
    var isPurchased: Boolean = false) {
}