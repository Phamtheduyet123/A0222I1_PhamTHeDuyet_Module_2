package bai_tap.stopwatch;

import java.util.Date;

public class StopWatch {
   private Date startTime, endTime;
    StopWatch(){
            startTime = new Date();
    }
   public Date getStartTime(){
        return this.startTime;
    }
    public Date getEndTime(){
        return this.endTime;
    }
    public Date start(){
       return new Date();
    }
    public Date stop(){
        return new Date();
    }
    public long  getElapsedTime(){
        return stop().getTime() - start().getTime();
    }
}
