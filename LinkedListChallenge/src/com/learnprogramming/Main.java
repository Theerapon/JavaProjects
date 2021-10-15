package com.learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Banana", 4.6);
        album.addSong("Love don't mean a thing", 1.1);
        album.addSong("Boxing", 1.2);
        album.addSong("Pencil", 1.3);
        album.addSong("Eraser", 4.3);
        album.addSong("High ball", 9.6);
        album.addSong("Magic", 5.6);
        album.addSong("Solider", 0.6);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Banana rock", 4.6);
        album.addSong("Love don't mean a thing rock", 1.1);
        album.addSong("Boxing rock", 2.2);
        album.addSong("Pencil rock", 4.3);
        album.addSong("Eraser rock", 2.3);
        album.addSong("High ball rock", 1.6);
        album.addSong("Magic rock", 1.3);
        album.addSong("Solider rock", 0.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("High ball", playList);
        albums.get(0).addToPlayList("Magic", playList);
        albums.get(0).addToPlayList("Solider", playList);
        albums.get(0).addToPlayList("Holy shit", playList); // Does not exist
        albums.get(0).addToPlayList(0, playList); // does not have a track 0
        albums.get(0).addToPlayList(1, playList);
        albums.get(0).addToPlayList(7, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList("Banana rock", playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();
        while (!quit) {

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================================");
    }
}
