package com.calclab.emite.xep.muc.client.events;

import com.google.gwt.event.shared.EventHandler;

public interface BeforeRoomInvitationSendHandler extends EventHandler {

    void onBeforeInvitationSend(BeforeRoomInvitationSendEvent event);

}
