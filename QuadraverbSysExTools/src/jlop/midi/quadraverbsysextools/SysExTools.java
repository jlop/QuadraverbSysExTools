package jlop.midi.quadraverbsysextools;

public interface SysExTools {
	
	/**
	 * 
	 * @param sysEx
	 * @return
	 */
	public byte[] getPatchDataFromSysEx(byte[] sysEx);
		
	/**
	 * 
	 * @param sysEx
	 * @return
	 */
	public byte getPatchNumberFromSysEx(byte[] sysEx);
	
	/**
	 * 
	 * @param sysEx
	 * @return
	 */
	public byte getCommandCodeFromSysEx(byte[] sysEx);
}
