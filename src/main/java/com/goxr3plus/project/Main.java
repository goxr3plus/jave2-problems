package com.goxr3plus.project;


public class Main {

	public Main() {

		DefaultFFMPEGLocator locator  = new DefaultFFMPEGLocator();

//		try {
//			File source = new File("file path");
//			File target = new File("file path");
//
//			//Audio Attributes
//			AudioAttributes audio = new AudioAttributes();
//			audio.setCodec("libmp3lame");
//			audio.setBitRate(128000);
//			audio.setChannels(2);
//			audio.setSamplingRate(44100);
//
//			//Encoding attributes
//			EncodingAttributes attrs = new EncodingAttributes();
//			attrs.setFormat("mp3");
//			attrs.setAudioAttributes(audio);
//
//			//Encode
//			Encoder encoder = new Encoder();
//			encoder.encode(new MultimediaObject(source), target, attrs);
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}

	public static void main(String[] args) {
		new Main();

	}
}
