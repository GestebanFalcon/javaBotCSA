package localhost.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceivedListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        System.out.println(e.getAuthor().getId());
        if (e.getAuthor().getId().equals("1227338421224079451")) {
            System.out.println("replying to my self like a dumbass");
            return;
        }
        e.getMessage().reply(e.getMessage().getContentRaw()).queue();
    }
}
