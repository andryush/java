/**
 * Created by Gagik on 9/3/18.
 */
public class TV implements RemoteControl{
    boolean iSsmart;
    boolean iScolor;
    String name;
    int maxChannel = 100;
    private int channel;

    public void setChannel(int channel)
    {
        if(channel >= 0 && channel < maxChannel)
        {
            this.channel = channel;
        }

    }

    public int getChannel()
    {
        return this.channel;
    }

    public void play()
    {
        for (int i = 0; i < maxChannel; i++ )
        {
            System.out.print("CHanel = " + i);
        }
    }
    public void stop()
    {
        channel = 0;
    }
    public void next()
    {
        channel++;
    }
    public void prev()
    {
        channel--;
    }





}
