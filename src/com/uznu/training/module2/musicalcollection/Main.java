package com.uznu.training.module2.musicalcollection;

import com.uznu.training.module2.musicalcollection.util.AlbumGenerator;
import com.uznu.training.module2.musicalcollection.util.Lyrics;
import com.uznu.training.module2.musicalcollection.util.SongGenerator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        List<String> nameOfAlbum = new ArrayList<String>();
        nameOfAlbum = Arrays.asList(AlbumGenerator.nameOfAlbum);

        List<String> song = new ArrayList<String>();
        song = Arrays.asList(SongGenerator.song);

        List<String> songTNT = new ArrayList<String>();
        songTNT = Arrays.asList(AlbumGenerator.SongsTNT);

        List<String> songHighwayToHell = new ArrayList<String>();
        songHighwayToHell = Arrays.asList(AlbumGenerator.SongsHighwayToHell);

        List<String> songBackInBlack = new ArrayList<String>();
        songBackInBlack = Arrays.asList(AlbumGenerator.SongsBackInBlack);

        List<String> songTheRazorEdge = new ArrayList<String>();
        songTheRazorEdge = Arrays.asList(AlbumGenerator.SongsTheRazorEdge);

        List<String> songBlackIce = new ArrayList<String>();
        songBlackIce = Arrays.asList(AlbumGenerator.SongsBlackIce);

        List<String> songRockOrBust = new ArrayList<String>();
        songRockOrBust = Arrays.asList(AlbumGenerator.SongsRockOrBust);

        List<String> lyricsTNT = new ArrayList<String>();
        lyricsTNT = Arrays.asList(Lyrics.LyricsTNT);

        List<String> lyricsHighwayToHell = new ArrayList<String>();
        lyricsHighwayToHell = Arrays.asList(Lyrics.LyricsHighwayToHell);

        List<String> lyricsBackInBlack = new ArrayList<String>();
        lyricsBackInBlack = Arrays.asList(Lyrics.LyricBackInBlack);

        List<String> lyricsTheRazorsEdge = new ArrayList<String>();
        lyricsTheRazorsEdge = Arrays.asList(Lyrics.LyricTheRazorsEdge);

        List<String> lyricsBlackIce = new ArrayList<String>();
        lyricsBlackIce = Arrays.asList(Lyrics.LyricsBlackIce);

        List<String> lyricsRockOrBust = new ArrayList<String>();
        lyricsRockOrBust = Arrays.asList(Lyrics.LyricsRockOrBust);


        System.out.println("I present to you albums and songs of AC / DC\n ");

        while (true) {
            System.out.println("Main menu:\n" +
                            "\n" +
                            "1.See all albums.\n" +
                            "2.Watch Lyrics of the songs.\n" +
                            "3.Find song.\n" +
                            "4.Finish."
            );


            try {
                int r = Integer.parseInt(scanner.nextLine());

                if (r == 1) {
                    for (int i = 0; i < nameOfAlbum.size(); i++) {
                        System.out.println("Album name: " + nameOfAlbum.get(i) + "\n" +
                                        "Songs:" + song.get(i) + "\n" +
                                        "==============================="
                        );
                        scanner.nextLine();
                    }
                } else if (r == 2) {
                    while (true) {
                        System.out.println("Select an album:");
                        for (int i = 0; i < nameOfAlbum.size(); i++) {
                            System.out.println(nameOfAlbum.get(i));
                            System.out.println(nameOfAlbum.get(i + 1));
                            System.out.println(nameOfAlbum.get(i + 2));
                            System.out.println(nameOfAlbum.get(i + 3));
                            System.out.println(nameOfAlbum.get(i + 4));
                            System.out.println(nameOfAlbum.get(i + 5));

                            int s = Integer.parseInt(scanner.nextLine());

                            if (s == 1) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");

                                    for (int a = 0; a < songTNT.size(); a++)
                                        System.out.println(songTNT.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsTNT.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsTNT.get(j));
                                        }
                                    }
                                    scanner.nextLine();
                                }
                            } else if (s == 2) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");
                                    for (int a = 0; a < songHighwayToHell.size(); a++)
                                        System.out.println(songHighwayToHell.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsHighwayToHell.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsHighwayToHell.get(j));
                                        }
                                    }
                                    scanner.nextLine();
                                }
                            } else if (s == 3) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");
                                    for (int a = 0; a < songBackInBlack.size(); a++)
                                        System.out.println(songBackInBlack.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsBackInBlack.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsBackInBlack.get(j));
                                        }
                                    }
                                    scanner.nextLine();
                                }
                            } else if (s == 4) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");
                                    for (int a = 0; a < songTheRazorEdge.size(); a++)
                                        System.out.println(songTheRazorEdge.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsTheRazorsEdge.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsTheRazorsEdge.get(j));
                                        }
                                    }
                                    scanner.nextLine();
                                }
                            } else if (s == 5) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");
                                    for (int a = 0; a < songBlackIce.size(); a++)
                                        System.out.println(songBlackIce.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsBlackIce.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsBlackIce.get(j));
                                        }
                                    }
                                    scanner.nextLine();
                                }
                            } else if (s == 6) {
                                while (true) {
                                    System.out.println("\n" +
                                            "Select song:");
                                    for (int a = 0; a < songRockOrBust.size(); a++)
                                        System.out.println(songRockOrBust.get(a));

                                    int h = Integer.parseInt(scanner.nextLine());
                                    for (int j = 0; j < lyricsRockOrBust.size(); j++) {
                                        if (h == j + 1) {
                                            System.out.println(lyricsRockOrBust.get(j));
                                        }
                                        scanner.nextLine();
                                    }
                                }
                            }
                        }
                    }
                } else if (r == 3) {
                    System.out.println("Enter the name of the song:");
                    String name = String.valueOf(scanner.nextLine());
                    for (int i = 0; i < song.size(); i++) {
                        String s = song.get(i);
                        String regex = "[^.]*(" + name + ")[^.]*(\\.|$)";
                        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
                        Matcher m = p.matcher(s);
                        while (m.find()) {
                            System.out.println("Album:" + nameOfAlbum.get(i) + "\n" +
                                            song.get(i) + "\n" +
                                            "------------"
                            );
                        }
                        scanner.nextLine();
                    }

                } else if (r == 4) {
                    System.out.println("Thank you for using this program.\n" +
                            "It was written by V.Shvets");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered the wrong number");

            }
        }
    }
}
