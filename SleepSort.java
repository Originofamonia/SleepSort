public class SleepSort implements Runnable {
    private String num;

    public SleepSort(int num){
        this.num = num + "";
    }

    public static void main(String[] args) {
        // 把这个数组升序输出
        int[] nums = {11, 3, 998, 5455, 1, 152, 990};
        for(int i = 0; i < nums.length; i++){
            SleepSort ss = new SleepSort(nums[i]);
            Thread t1 = new Thread(ss);
            t1.start();
        }
    }

    public void run(){
        try{
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
