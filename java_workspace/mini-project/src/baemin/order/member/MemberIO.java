package baemin.order.member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import baemin.order.manager.MemberManager;

public class MemberIO {
	public MemberIO() {
		super();	
	}
	
	public HashMap<String, Member> loadMemberFile(){
		
		try(FileInputStream fis = new FileInputStream("memberFile.ser"); 
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);){
			
			HashMap<String, Member> memberMap = (HashMap<String,Member>) ois.readObject();
			
			return memberMap;
				
		}
		catch (EOFException e) {
			System.out.println("dd");
			HashMap<String, Member> tmp = new HashMap<>();
			saveMemberFile(tmp);
			//e.printStackTrace();
		}
		catch (IOException | ClassNotFoundException  e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void saveMemberFile(HashMap<String, Member> memberMap) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("memberFile.ser")))) {
			oos.writeObject(memberMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
