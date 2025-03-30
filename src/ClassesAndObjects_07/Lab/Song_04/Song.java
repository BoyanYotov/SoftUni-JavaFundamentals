package ClassesAndObjects_07.Lab.Song_04;

public class Song {
    private String typeList;
    private String songName;
    private String duration;

    public Song(String typeList, String songName, String duration){
        this.typeList = typeList;
        this.songName = songName;
        this.duration = duration;
    }

    public String getTypeList(){
        return typeList;
    }

    public String getSongName(){
        return songName;
    }


}
