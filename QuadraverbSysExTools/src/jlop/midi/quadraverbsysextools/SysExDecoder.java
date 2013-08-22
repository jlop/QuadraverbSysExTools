package jlop.midi.quadraverbsysextools;

public interface SysExDecoder {
	/**
	 * Decode patch data retrieved via MIDI SysEx command
	 * @param Encoded patch data from MIDI SysEx command without MIDI header and footer
	 * @return Decoded patch data
	 */
	public byte[] decodePatchData(byte[] data);
}
