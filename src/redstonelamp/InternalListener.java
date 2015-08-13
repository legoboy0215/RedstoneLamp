package redstonelamp;

import redstonelamp.event.Event;
import redstonelamp.event.Listener;
import redstonelamp.event.player.PlayerJoinEvent;
import redstonelamp.event.player.PlayerQuitEvent;

/**
 * Internal Listener for the Server.
 *
 * @author jython234
 */
public class InternalListener implements Listener{
    private Server server;

    public InternalListener(Server server){
        this.server = server;
    }

    @Override
    public void onEvent(Event event) {
        if(event instanceof PlayerJoinEvent){
            //PlayerJoinEvent evt = (PlayerJoinEvent) event;
            server.getNetwork().setName(server.getMotd()); //Update the player list
        } else if(event instanceof PlayerQuitEvent){
            server.getNetwork().setName(server.getMotd()); //Update the player list
        }
    }
}
