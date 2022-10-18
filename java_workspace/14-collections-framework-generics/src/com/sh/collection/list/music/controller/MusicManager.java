package com.sh.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sh.collection.list.music.model.vo.Music;

public class MusicManager {

	private List<Music> musicList = new ArrayList<>();
	
	public MusicManager() {
		super();
		musicList.add(new Music("At My Worst", "Pink Sweat$"));
		musicList.add(new Music("Honeysty", "Pink Sweat$"));
		musicList.add(new Music("빈차(feat. OHHYUK)", "EPIK HIGH"));
		musicList.add(new Music("그댄 달라요", "버스커 버스커"));
		musicList.add(new Music("그댈 마주하는건 힘들어 (그마힘)", "버스커 버스커"));
	}
	
	public MusicManager(List<Music> musicList) {
	}


	// * 1. 음악리스트 리턴
	// + selectList():List<Music>
	public List<Music> selectList() {
		return musicList;
	}
	// 2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
	// + addList(Music) : void
	public void addList(Music music) {
		musicList.add(music);
	}
	
	// 3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	// + addAtZero(Music) : void
	public void addAtZero(Music music) {
		musicList.add(0, music);
	}
	
	// 4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
	// 삭제여부를 리턴
	// + removeMusic(String) : boolean
	public boolean removeMusic(String title) {
		boolean bool = false;
		for(Music music : musicList) {
			if(music.getTitle().equals(title)) {
				System.out.println("삭제됐습니다.");
				bool = musicList.remove(music);
				break;
			}else {
				System.out.println("곡을 찾지 못했습니다.");
				bool = musicList.remove(music);
				break;
			}
		}
		return bool;
	}
	
	// 5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
	// 교체 성공여부를 리턴
	// + boolean replaceMusic(Music oldMusic, Music newMusic) : boolean
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		boolean bool = musicList.contains(oldMusic);
		if(bool == true) {
			System.out.println("교체하였습니다.");
			musicList.set(musicList.indexOf(oldMusic), newMusic);
		}else{
			System.out.println("검색결과가 없습니다.");
		}
		return bool;
	}
	
	// 6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
	// (곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	// + searchMusicByTitle(String title) : List<Music>
	
	public List<Music> searchMusicByTitle(String title){
		List<Music> searchMusic = new ArrayList<>();
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getTitle().indexOf(title) != -1) {
				searchMusic.add(musicList.get(i));
			}
		}
		System.out.println(searchMusic != null? searchMusic : "검색결과가 없습니다.");
		return searchMusic;
	}
	
	// 7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	// + searchMusicBySinger(String singer) : List<Music>
	public List<Music> searchMusicBySinger(String singer){
		List<Music> searchMusic = new ArrayList<>();
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getSinger().indexOf(singer) != -1) {
				searchMusic.add(musicList.get(i));
			}
		}
		System.out.println(searchMusic != null? searchMusic : "검색결과가 없습니다.");
		return searchMusic;
		
	}
	
	// 8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	// + orderBy(Comparator<Music> c) : List<Musice>
	public List<Music> orderBy(Comparator<Music> c){
		musicList.sort(c);
		return musicList;
	}

}
