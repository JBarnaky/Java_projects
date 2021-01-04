package containers;

import static music.MusicStyles.*;
import music.Track;
import service.MusicService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Disc {

    public Disc() throws IOException {
        List<Track> tracklist = new ArrayList<>();

        tracklist.add(new Track("Unkle - Hold my hand ", 4.59, ROCK));
        tracklist.add(new Track("Килограмм - Меня радует ", 3.29, RAP_AND_HIPHOP));
        tracklist.add(new Track("Nickelback - Breathe ", 3.58, ROCK));
        tracklist.add(new Track("Travis - Flowers in the window ", 3.41, BLUES));
        tracklist.add(new Track("Thievery corporation - Depth of my soul", 3.23, ELECTRONIC));
        tracklist.add(new Track("Iron maiden - Fear of the dark ", 7.16, METAL));
        tracklist.add(new Track("Louis Armstrong - What a wonderful world ", 2.17, JAZZ));
        tracklist.add(new Track("Beethoven - Moonlight Sonata ", 15.0, CLASSIC));
        tracklist.add(new Track("Lissie - When im alone ", 3.43, POP));
        tracklist.add(new Track("Creedence clearwater revival - Looking out my back door  ", 2.34, REGGAE));
        tracklist.add(new Track("God is an astronaut - Autumn song ", 3.47, ALTERNATIVE));

        MusicService service = new MusicService();
        
        service.getTracklist(tracklist);
        service.writeToDisk(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, ROCK);
        service.findByRange(3.0, 4.0, tracklist);
    }
}
