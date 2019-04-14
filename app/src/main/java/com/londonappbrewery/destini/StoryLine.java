package com.londonappbrewery.destini;

public class StoryLine {
    private int storyId;
    private int leftAns;
    private int rightAns;
    private int next;
    public StoryLine(int storySequence, int lightTale, int rightTale, int nextId){
        storyId = storySequence;
        leftAns = lightTale;
        rightAns = rightTale;
        next = nextId;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public int getLeftAns() {
        return leftAns;
    }

    public void setLeftAns(int leftAns) {
        this.leftAns = leftAns;
    }

    public int getRightAns() {
        return rightAns;
    }

    public void setRightAns(int rightAns) {
        this.rightAns = rightAns;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
