package objectjava;

//��� ���ڼ� �������� ����������!
class overloadingCalculator{
    int[] oprands; 
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
     // ���ڸ� �迭�� ���; �ϳ��� ���ڷ� ������ ������ �� �ִ�.
    }
     
    public void sum(){
        int total = 0; //��������
        
        //for each�� - for(A:B); B���� ���ʴ�� ������ A�� �ְڴ�.
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
        c1.setOprands(new int[]{10,20}); //���ڿ� new int[]{} �迭����
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   
    }
}