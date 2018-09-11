/**
 * Created by Gagik on 9/3/18.
 */
public class Clock implements RemoteControl{
    int hours;
    int minutes;
    int seconds;
    int time;

    public void play()
    {
      time++;
      System.out.print("Time = " + time);
    }
    public void stop()
    {
        time = 0;
    }
    public void next()
    {
        time += 3600;
    }
    public void prev()
    {
        time -= 3600;
    }
}
