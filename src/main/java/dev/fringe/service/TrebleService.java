package dev.fringe.service;

public interface TrebleService extends com.sun.jna.Library {
    int treble(int value);
}