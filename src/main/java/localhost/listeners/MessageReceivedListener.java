package localhost.listeners;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceivedListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getAuthor().getId() == "1227338421224079451") {
            return;
        }
        e.getMessage().reply(e.getMessage().getContentRaw()).queue();
    }
}
