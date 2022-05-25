package client.entity;

import java.util.Map;

public class BencodeTorrent {
    public String announce;
    public BencodeInfo info;

    public BencodeTorrent(){
        info = new BencodeInfo();
        announce = "";
    }

    public BencodeTorrent(Map<String, Object> dict){
        info = new BencodeInfo();
        announce = (String) dict.getOrDefault("announce", "");
        info.pieceLength = (Long)((Map<String, Object>)dict.get("info")).getOrDefault("piece length", 0);
        info.name = (String)((Map<String, Object>)dict.get("info")).getOrDefault("name", 0);
        info.pieces = (String)((Map<String, Object>)dict.get("info")).getOrDefault("pieces", "");
    }

    @Override
    public String toString() {
        return "BencodeTorrent{" +
                "announce='" + announce + '\'' +
                ", info=" + info +
                '}';
    }
}
