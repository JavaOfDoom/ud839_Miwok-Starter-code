package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the defualt translation of a word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *Get the Miwok translation of a word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED;}

    public int getAudioResourceId() {return mAudioResourceId;}
}
