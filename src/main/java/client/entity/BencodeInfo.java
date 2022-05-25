package client.entity;

public class BencodeInfo {
    public String pieces;
    public Long pieceLength;
    public Long length;
    public String name;

    @Override
    public String toString() {
        return "BencodeInfo{" +
                "pieces='" + pieces + '\'' +
                ", pieceLength=" + pieceLength +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
