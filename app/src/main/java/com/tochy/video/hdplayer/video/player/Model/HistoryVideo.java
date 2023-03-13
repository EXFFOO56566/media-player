package com.tochy.video.hdplayer.video.player.Model;

import com.tochy.video.hdplayer.video.player.Extra.MediaData;

import java.util.ArrayList;

public class HistoryVideo {
    ArrayList<MediaData> videoList;

    public HistoryVideo(ArrayList<MediaData> arrayList) {
        this.videoList = arrayList;
    }

    public ArrayList<MediaData> getVideoList() {
        return this.videoList;
    }

    public void setVideoList(ArrayList<MediaData> arrayList) {
        this.videoList = arrayList;
    }
}
