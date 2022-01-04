package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class TimerUtils {

    private int timeRemaining;
    private Timer timer;

    public TimerUtils(int timeRemaining, Timer timer) {
        this.timeRemaining = timeRemaining;
        this.timer = timer;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public void cancelTimer() {
        this.timer.cancel();
    }

    private int setInterval(int interval) {
        if (interval == 1)
            this.timer.cancel();
        return interval - 1;
    }

    public void startTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                timeRemaining = setInterval(timeRemaining);
                if (timeRemaining == 0) {
                    System.out.println("You lose too slow!");
                }
            }
        }, 1000, 1000);
    }
}
