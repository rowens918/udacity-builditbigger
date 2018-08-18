package com.example.android.javajokeslib;

import java.util.Random;

public class Jokes {
    static Random rand = new Random();

    //Jokes are courtesy of WildStar's Holographic Taxi Driver :P
    private static String[] jokes =
    {
            "My old lady says I got an addiction to brake fluid... \n...\nBut I keep telling her, \"I can STOP any time!\"",
            "That ex of mine... also a cab... But I had to scrap her... \n... \nShe was way too high maintenance!\nKept giving me mixed signals.",
            "It's like my backup drive always used to say... \n... \n The meter stops ticking for no man. \n... \nI guess the \"While it's in motion\" part's sorta implied.",
            "Sit back and leave the driving to us... \n... \nUnless there's a malfunction, in which case, take over.",
            "My formula for success...? \n... \nNever take advise from strangers... \n... \nTrust me on this! It's never failed.",
            "Humans! Don't get me started... \nDo they actually think flashing ME a little leg is gonna matter? \n... \nOh, and the women are even worse!",
            "Being a hologram isn't always a bed of rose pixels... \n... \nBut it sure makes getting in bar fights less painful.",
            "So where was I? \n... \nOh, my ex left me. \n...\nSaid I was \"too insubstantial...\" \nYou believe that? \nI'm just as substantial as the next hologram, I'll tell ya that!"
    };

    public static String getJoke() {
        return jokes[rand.nextInt(jokes.length)];
    }
}
