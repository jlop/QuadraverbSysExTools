package jlop.midi.quadraverbsysextools;

public class QadraverbPlusSysExDecoder implements SysExDecoder {

	@Override
	public byte[] decodePatchData(byte[] data) {
        byte[] decodedData = new byte[128];
        byte currentShift = 1;
        int currentDecodedByte = 0;
        for (int i = 0; i < data.length - 1; i++) {
            decodedData[currentDecodedByte++] = (byte)(((byte)(data[i] % Math.pow(2, 8 - currentShift)) << currentShift) + (data[i + 1] >> (7 - currentShift)));
            if (currentShift < 7) {
                currentShift++;
            } else {
                currentShift = 1;
                i++;
            }
        }

        return decodedData;
	}

}
