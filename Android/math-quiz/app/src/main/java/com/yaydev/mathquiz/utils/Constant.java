package com.yaydev.mathquiz.utils;
import java.io.Serializable;


public class Constant  implements Serializable{

    //please change publisher id in androidmanifest

    public static final boolean show_admob_banner=true ; // show AdMob Smart banner
    public static final boolean show_admob_interstitial = true; // show AdMob Interstitial
    public static final String adMob_key_banner = "ca-app-pub-4905035688129642/8557013844";
    public static final String adMob_key_interstitial = "ca-app-pub-4905035688129642/2474821223";

    public static Boolean show_banner_ad = false; // show reward video
    public static String rewarded_ad_id="ca-app-pub-4905035688129642/1416890428";
    public static final int reward_time_inseconds=10;//set seconds to win after watching the reward video


    public static final int time_inseconds=60;
    public static final int questions_number = 21;
    public static final int max__number_value = 11;



}
