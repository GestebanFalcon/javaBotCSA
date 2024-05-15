package localhost;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import src.main.java.localhost.toilet.Piss;

/**
 * Hello world!
 *
 */
public class Bot 
{
    private final ShardManager shardManager
    public Bot() {
        DefaultShardManagerBuilder builder = new DefaultShardManagerBuilder.createDefault("");
        builder.setStatus(OnlineStatus.ONLINE);
        shardManager = builder.build();
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Piss joe = new Piss(31, "joebert");
        joe.urinate();
        
    }
}
