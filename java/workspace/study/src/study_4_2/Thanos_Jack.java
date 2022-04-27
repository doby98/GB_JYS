package study_4_2;

/* 
타노스는 프로그램의 균형을 위해서는 리스트의 원소 절반을 무작위로 삭제해야 한다고 믿고 있다.
타노스가 손가락을 튕겼을 때(프로그램을 실행했을 때) 입력된 리스트에서 
절반의 원소를 무작위로 삭제하여 리턴하는 인피니티 건틀렛 프로그램을 작성하시오.
(무작위 삭제이므로 입력값이 같아도 출력값이 매번 달라야 합니다)
(Scanner 이용)

입력 예시
[2, 3, 1, 6, 5, 7]

출력 예시 1
[2, 5, 7]

출력 예시 2
[3, 6, 5]

* 참고: 리스트의 원소가 홀수개일 경우 절반의 확률로 절반보다 많은 원소가 삭제되거나 
         절반보다 적은 원소가 삭제되어야 합니다. 
         (만약 리스트의 원소가 7개라면 절반의 확률로 3개 또는 4개의 원소가 삭제됨) 
*/

public class Thanos_Jack {
	
	private int[] thanos_list;
	
	private int delete_count = 0;
	private int delete_num = 0;
	
	public int[] getThanos_list() {
		return thanos_list;
	}
	
	int[] delete_arr;

	public void setThanos_list(int[] thanos_list) {
		this.thanos_list = thanos_list;
	}

	public int getDelete_count() {
		return delete_count;
	}

	public void setDelete_count(int delete_count) {
		this.delete_count = delete_count;
	}

	public int getDelete_num() {
		return delete_num;
	}

	public void setDelete_num(int delete_num) {
		this.delete_num = delete_num;
	}
	
	public void finger_snap() {	
		
		if( thanos_list.length % 2 == 0 ) {
			this.delete_count = thanos_list.length / 2; 
		} else {
			this.delete_count = (int)Math.round(Math.random() + thanos_list.length / 2);
		}
		
		this.delete_arr = new int[delete_count];
		
		for( int repeat = 0; repeat < this.delete_count; repeat++ ) {
			
			int[] change_arr = new int[this.thanos_list.length - 1];
			
			this.delete_num = (int)(Math.random() * thanos_list.length);
			
			for( int i = 0; i < delete_num; i++ ) {
				change_arr[i] = this.thanos_list[i];
			}
			
			for( int j = delete_num; j < change_arr.length; j++ ) {
				change_arr[j] = this.thanos_list[j+1];
			}
			
			this.delete_arr[repeat] = this.thanos_list[delete_num];
			
			this.setThanos_list(change_arr);
		}
			
	}
	
}














