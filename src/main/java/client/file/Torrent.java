package client.file;

import client.entity.BencodeTorrent;
import client.entity.TorrentFile;
import com.dampcake.bencode.Bencode;
import com.dampcake.bencode.Type;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;


public class Torrent {
    public static BencodeTorrent open(String path) throws IOException {
        InputStream inputfile = new FileInputStream(path);
        Bencode bencode = new Bencode();

        Map<String, Object> dict = bencode.decode(inputfile.readAllBytes(), Type.DICTIONARY);
        BencodeTorrent newfile = new BencodeTorrent(dict);
        return newfile;
    }

    public static void main(String[] args){

    }
}
