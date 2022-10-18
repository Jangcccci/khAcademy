package com.sh.collection.list.music.model.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Music implements Comparable<Music>{

	private String title;
	private String singer;
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "곡명 : " + this.title + "/ 가수 : " + this.singer;
	}
	@Override
	public int compareTo(Music o) {
//		List<Music> musicList = (List<Music>)((ArrayList<Music>)this.musicList).clone();
		
		return this.singer.compareTo(o.singer);
	}
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	
	
}
