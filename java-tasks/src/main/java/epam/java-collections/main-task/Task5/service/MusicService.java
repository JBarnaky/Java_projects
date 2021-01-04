package service;

import music.MusicStyles;
import music.Track;

import java.io.IOException;
import java.util.List;
import java.util.Comparator;
import java.io.FileWriter;

public class MusicService {
    private static final String TOTAL_DURATION = "Total duration: ";
    private static final String MIN = " min";
    private Double duration = 0.0;

    public void getTracklist(List<Track> tracklist) {
        System.out.println("Tracklist: ");

        for (Track t : tracklist) {
            System.out.println(t.toString());
        }
        System.out.println();
    }

    public void writeToDisk(List<Track> tracklist) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        System.out.println("Tracklist has been written to file \n");
        for(Track track : tracklist) {
            writer.write(track + System.lineSeparator());
        }
        writer.close();
    }

    public void getTotalDuration(List<Track> tracklist) {
        for (Track track : tracklist) {
            duration += track.getDuration();
        }
        System.out.println(TOTAL_DURATION + duration + MIN);
        System.out.println();
    }

    public void sortingByStyle(List<Track> tracklist, MusicStyles style) {
        System.out.println("Sorted by style: " + style);

        for (Track t : tracklist) {
            if (t.getStyle() == style) {
                System.out.println(t.toString());
            }
        }
        tracklist.sort(Comparator.comparing(Track::getStyle));

        for (Track t : tracklist) {
            if (t.getStyle() != style) {
                System.out.println(t.toString());
            }
        }
        System.out.println();
    }

    public void findByRange(Double from, Double to, List<Track> tracklist) {
        System.out.println("Find track by range from " + from + " to " + to + " min ");
        tracklist.sort(Comparator.comparing(Track::getDuration));

        for (Track track : tracklist) {
            if (track.getDuration() >= from && track.getDuration() <= to) {
                System.out.println(track.toString());
            }
        }
    }
}