package stack;
import java.util.*;
public class SimplifyDirectoryPath {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String path = in.next();
		int n = path.length();
		Stack<String> s = new Stack<String>();
		String res = "";
		res+= "/";
		for(int i = 0; i<n; i++){
			
			String dir = "";
			if(i < n && path.charAt(i) == '/'){
				continue;
			}
			while(i < n && path.charAt(i) != '/'){
				dir += path.charAt(i);
				i++;
			}
			if(dir.equals("..") == true){
				if(!s.isEmpty())
					s.pop();
				
			}else if(dir.equals(".") == true)
				continue;
			
			else if(dir.length() != 0)
				s.push(dir);
		}
		Stack<String> ss = new Stack<String>();
		while(!s.isEmpty()){
			ss.push(s.pop());
		}
		while(!ss.isEmpty()){
			if(ss.size() != 1){
				res+= (ss.pop()+"/");
			}else{
				res += ss.pop();
			}
		}
		System.out.println(res);
	}

}
