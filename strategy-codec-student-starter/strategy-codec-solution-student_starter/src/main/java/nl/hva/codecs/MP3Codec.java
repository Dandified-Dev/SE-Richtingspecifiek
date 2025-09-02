package nl.hva.codecs;

import nl.hva.Recordings.Recording;

public class MP3Codec implements Codec{
    @Override
    public String decode() {
        return "Decoding mp3";
    }

    @Override
    public Recording encode(String title) {
        return null;
    }

    @Override
    public FileType getFileType() {
        return FileType.MP3;
    }

    @Override
    public String getCodecInformation() {
        return CodecDescriptions.MP3_DESCRIPTION;
    }
}
