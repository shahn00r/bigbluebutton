package org.bigbluebutton.web.services.messages;

public class DeletePinsMessage implements IVoiceMessage {

	public final String meetingId;
	public final String voiceConf;
	
	public DeletePinsMessage(String meetingId, String voiceConf) {
		this.meetingId = meetingId;
		this.voiceConf = voiceConf;
	}
}