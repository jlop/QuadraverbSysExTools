package jlop.midi.quadraverbsysextools;

public class QuadraverbPlusSysExTools implements SysExTools {
	
	private static byte sysExHeaderLength = 7;		//7 bytes
	private static byte sysExFooterLength = 1;		//1 byte
	private static byte sysExCommandCodeByte = 5;	//5th byte in SysExHeader contains the command code
	private static byte sysExPatchNumberByte = 6;	//6th byte in SysExHeader contains the patch number

	@Override
	public byte[] getPatchDataFromSysEx(byte[] sysEx) {
		checkSysEx(sysEx);
		
		byte[] data = new byte[sysEx.length - (sysExHeaderLength + sysExFooterLength)];
		for (int i = sysExHeaderLength; i < sysEx.length - sysExFooterLength; i++) {
			data[i - sysExHeaderLength] = sysEx[i];
		}
		
		return data;
	}

	@Override
	public byte getPatchNumberFromSysEx(byte[] sysEx) {
		checkSysEx(sysEx);
		return sysEx[sysExPatchNumberByte];
	}

	@Override
	public byte getCommandCodeFromSysEx(byte[] sysEx) {
		checkSysEx(sysEx);
		return sysEx[sysExCommandCodeByte];
	}
	
	private void checkSysEx(byte[] sysEx) {
		//check length
		if (sysEx.length <= sysExHeaderLength + sysExFooterLength) throw new java.lang.ClassFormatError();
		
		//check vendor id
		//...
	}

}
