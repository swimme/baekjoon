package objectjava;

//계산 숫자수 여러개인 현실적예제!
class overloadingCalculator{
    int[] oprands; 
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
     // 인자를 배열로 사용; 하나의 인자로 여러개 값받을 수 있다.
    }
     
    public void sum(){
        int total = 0; //지역변수
        
        //for each문 - for(A:B); B에서 차례대로 꺼내서 A에 넣겠다.
        for(int value : this.oprands){ 
            total += value;
        }
        System.out.println(total);
    }
    
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
    	overloadingCalculator c1 = new overloadingCalculator();
        c1.setOprands(new int[]{10,20}); //인자에 new int[]{} 배열선언
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   
    }
}