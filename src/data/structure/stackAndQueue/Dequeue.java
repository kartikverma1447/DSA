package data.structure.stackAndQueue;

class Dequeue {
    final static int MAX  = 10;
    int[] arr;
    int size;
    int front;
    int rear;
    public Dequeue(){
        arr=new int[MAX];
        size=0;
        front=-1;
        rear = -1;
    }
    public Dequeue(int capacity){
        arr = new int[capacity];
        size = 0;
        front=-1;
        rear = -1;
    }
    public void insertFront(int value){
        if(size==arr.length){
            System.out.println("-1");
            return;
        }
        
        size++;
        if (front == -1) {
			front = 0;
			rear = 0;
		}
        else if(front == 0){
            front = arr.length-1;
        }
        else{
            front = front-1;
        }
        arr[front] = value; 
    }
    public void insertRear(int value){
        if(size==arr.length){
           System.out.println("-1");
            return;
        }
        size++;
        if (front == -1) {
			front = 0;
			rear = 0;
		}
        else if(rear==arr.length-1){
            rear = 0;
        }
        else{
            rear = rear+1;
        }
        arr[rear] =  value;
    }
    public void deleteFront(){
        if(size==0){
          System.out.println("-1");
            return;
        }
        size--;
        if(front==arr.length-1){
            front = 0;
        }else{
            front = front+1;
        }   
    }
    public void deleteRear(){
       if(size==0){
          System.out.println("-1");
            return;
        }
        size--;
        if(rear==0){
            rear = arr.length-1;
        }else{
            rear = rear-1;
        }
    }
    public int getFront(){
        if(size==0){
            return -1;
        }
		return arr[front];
    }
    public int getRear(){
        if(size==0){
            return -1;
        }
		return arr[rear];
    }
}
