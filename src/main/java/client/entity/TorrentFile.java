package client.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TorrentFile {
    public String announce;
    public List<List<String>> announceList;
    public Byte[] infoHash;
    public BencodeInfo info;
    public Byte[][] pieceHashes;
    public Long pieceLength;
    public Integer length;
    public String name;

    public TorrentFile(){
    }

    public TorrentFile(Map<String, Object> dict){
        info  = new BencodeInfo();
        announce = (String) dict.getOrDefault("announce", "");
        //System.out.println(dict.get("info").getClass());
        info.pieceLength = (Long)((Map<String, Object>)dict.get("info")).getOrDefault("piece length", 0);
        info.name = (String)((Map<String, Object>)dict.get("info")).getOrDefault("name", 0);


    }

    @Override
    public String toString() {
        return "TorrentFile{" +
                "announce='" + announce + '\'' +
                ", announceList=" + announceList +
                ", infoHash=" + infoHash +
                ", pieceHashes=" + pieceHashes +
                ", pieceLength=" + pieceLength +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
