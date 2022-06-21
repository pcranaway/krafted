package logic.listeners

import event.Handle
import event.Listener
import server.connection.ConnectionClosedEvent
import server.connection.ConnectionEstablishedEvent

class ConnectionListener : Listener {

    @Handle(ConnectionEstablishedEvent::class)
    fun onConnectionEstablished(event: ConnectionEstablishedEvent) { }

    @Handle(ConnectionClosedEvent::class)
    fun onConnectionClosed(event: ConnectionClosedEvent) { }

}