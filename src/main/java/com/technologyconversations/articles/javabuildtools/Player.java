package com.technologyconversations.articles.javabuildtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player {

    private static String[] points = {"love", "fifteen", "thirty", "forty"};
    public static final List<String> POINTS_DESCRIPTION = Collections.unmodifiableList(Arrays.asList(points));

    private int score;
    public final int getScore() {
        return score;
    }
    private String name;
    public final String getName() {
        return name;
    }

    public final void winBall() {
        this.score = this.score + 1;
    }

    public Player(final String nameValue) {
        this.name = nameValue;
    }

    public final String getScoreDescription() {
        return POINTS_DESCRIPTION.get(score);
    }

}
