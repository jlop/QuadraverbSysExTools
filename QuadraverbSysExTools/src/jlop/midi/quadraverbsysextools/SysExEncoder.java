package jlop.midi.quadraverbsysextools;

public interface SysExEncoder {
	/**
	 * Encode patch data to concatenate with MIDI header and footer to MIDI SysEx command
	 * @param Patch data
	 * @return Encoded patch data
	 */
	public byte[] encodePatchData(byte[] data);
}
