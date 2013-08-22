package jlop.midi.quadraverbsysextools;

public class QuadraverbPlusSysExEncoder implements SysExEncoder {

	@Override
	public byte[] encodePatchData(byte[] data) {
		byte[] encodedData = new byte[147];
		byte currentShift = 1;
		int currentEncodedByte = 0;
		for (int i = 0; i < data.length; i++) {
			encodedData[currentEncodedByte++] += (byte)(data[i] >> currentShift);
            encodedData[currentEncodedByte] = (byte)((byte)(data[i] % Math.pow(2, currentShift)) << (7 - currentShift));
			if (currentShift < 7) {
				currentShift++;
			} else {
				currentShift = 1;
				currentEncodedByte++;
			}
		}
		
		return encodedData;
	}
	
}
