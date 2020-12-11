/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(String time) {
  
        this.hour = Integer.parseInt(time.charAt(0) + "" + time.charAt(1));
        this.minute = Integer.parseInt(time.charAt(3) + "" + time.charAt(4));
        this.second = Integer.parseInt(time.charAt(6) + "" + time.charAt(7));

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String h= String.format("%02d:%02d:%02d", hour , minute , second);
        return  h;
    }

    public Time nextSecond() {
        second = second + 1;
        if (second == 60) {
            second = 0;
            minute = minute + 1;
            if (minute == 60) {
                minute = 0;
                hour = hour + 1;
            }
        }
        return this;
    }

    public Time previousSecond() {
        second = second - 1;
        if (second == 0) {
            second = 59;
            minute = minute - 1;
            if (minute == 0) {
                minute = 59;
                hour = hour - 1;
            }
        }
        return this;
    }
}
