package com.example.miranda.mediaplayback;

public class VidClip {
    private String judul;
    private String durasi;
    private String videoRawId;

    //array judul video di kategori video
    public static final VidClip[] video = {
            new VidClip("Jikustik - Puisi", "03:45", "https://r1---sn-htgx20capjpq-jb3l.googlevideo.com/videoplayback?fvip=1&clen=18872814&dur=225.697&ratebypass=yes&c=WEB&key=cms1&mime=video%2Fmp4&id=o-ANcI0-Rg2c0RYhC7-eHL9DfgteA0MboXb_1BCeSLE8Pc&ip=46.19.231.54&itag=18&pl=24&gir=yes&requiressl=yes&source=youtube&ei=CNr9W4LgKdivgQfqyKXABw&lmt=1537348170096880&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pcm2cms,pl,ratebypass,requiressl,source&ipbits=0&expire=1543384680&signature=541773B835DED89393D260D56FD84F12C7ED7346.0AE5C42780F41AB5AA0333C4F11732E1105B2191&video_id=Ee03yDNlm1k&title=%5BOfficial+Video%5D+Jikustik+-+Puisi&rm=sn-30wuxn5-2goz7e,sn-nv4sd7e&fexp=23763603&req_id=c5e1edcbc6f8a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mip=158.140.172.39&mm=29&mn=sn-htgx20capjpq-jb3l&ms=rdu&mt=1543375812&mv=m&pcm2cms=yes"),
            new VidClip("Fiersa - Waktu yang Salah", "05:12", "https://r2---sn-htgx20capjpq-jb3l.googlevideo.com/videoplayback?dur=312.981&expire=1543396806&pl=24&gir=yes&ratebypass=yes&itag=18&key=cms1&ipbits=0&signature=6A7E6A8AE9C426B72F6A10F0C56690D5254805B2.4CD246201F185EC1446643D4245896A420538A&source=youtube&c=WEB&clen=22238731&requiressl=yes&mime=video%2Fmp4&fvip=2&lmt=1537136412531159&id=o-ALa_U-csaZG6VYlMkz-t_OPFKEKD_4tY3fJtQHTC-bT6&ei=ZQn-W9X4O5etwwSa4Kb4Dw&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pcm2cms,pl,ratebypass,requiressl,source&beids=9466587&ip=191.240.99.142&video_id=XJXKfq26N_w&title=Fiersa+Besari+ft+Tantri+-+Waktu+Yang+Salah++%5Bunofficial+lirik+video%5D&rm=sn-8p5hvj-jo4e7l,sn-bg0de7l&fexp=9466587,23763603&req_id=2506cefcc3eaa3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mip=158.140.172.39&mm=29&mn=sn-htgx20capjpq-jb3l&ms=rdu&mt=1543375878&mv=m&pcm2cms=yes")
    };

    //setiap data ada judul, durasi, gambar
    public VidClip(String judul, String durasi, String videoRawId) {
        this.judul = judul;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }

    public String getJudul(){
        return judul;
    }

    public String getDurasi(){
        return durasi;
    }

    public String getVideoRawId(){
        return videoRawId;
    }

    public String toString(){
        return this.judul;
    }
}
