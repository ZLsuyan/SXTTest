package cn.edu.hit;

/**
 * 利用面向对象的思想，求出500个手拉手围成圈的小孩逢三退一的最后的圈里剩的小孩的数组的下标
 * @author zengli
 * @date 2016/5/6
 */
public class Count3Quit2 {
	public static void main(String[] args) {
		KidCircle kc = new KidCircle(500);
		int countNum = 0;
		Kid k = kc.first;
		while(kc.count>1){
			countNum++;
			if(countNum==3){
				countNum = 0;
				kc.deleteKid(k);
			}
			k = k.right;
		}
		int index = kc.first.id;
		System.out.println("最后剩下的那个人的数组下标为："+index+"，即第"+(index+1)+"个人");
	}
}

class Kid{
	int id;
	Kid left;
	Kid right;
}

class KidCircle{
	int count = 0;
	Kid first,last;
	KidCircle(int num){
		for(int i=0;i<num;i++){
			addKid();
		} 
	}
	
	void addKid(){
		Kid k = new Kid();
		k.id = count;
		if(count<=0){
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		}else{
			last.right = k;
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;
		}
		count ++;
	}
	
	void deleteKid(Kid k){
		if(count<=0){
			return;
		}else if(count==1){
			first = last = null;
		}else{
			k.left.right = k.right;
			k.right.left = k.left;
			if(k==first){
				first = k.right;
			}else if(k==last){
				last = k.left;
			}
		}
		count --;
	}
	
}