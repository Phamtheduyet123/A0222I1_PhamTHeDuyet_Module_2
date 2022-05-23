package bai_tap.stopwatch;

import java.util.Date;

public class StopWatch {
   private Date startTime, endTime;
    StopWatch()
    {
            startTime = new Date();
    }

    public void stop(){
        endTime = new Date();
    }
    public long  getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}
