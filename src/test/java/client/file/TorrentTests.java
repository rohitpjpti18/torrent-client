package client.file;

import client.entity.BencodeTorrent;
import client.entity.TorrentFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TorrentTests {

    @Test
    void readTorrentFile(){

        try{
            String path = "D:\\torrentfiles\\good-will-hunting.torrent";
            BencodeTorrent t = Torrent.open(path);
            //System.out.println(t);
            assertEquals(t.announce, "udp://tracker.coppersurfer.tk:6969/announce");
            assertEquals(t.info.name, "Good Will Hunting (1997)");
            assertEquals(t.info.pieceLength, 1048576L);
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

    }
}
