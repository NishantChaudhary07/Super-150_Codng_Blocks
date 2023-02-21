package Heap;

import java.util.ArrayList;

public class Min_Heap {
    private ArrayList<Integer> data=new ArrayList<>();

    public void add(int item){
        this.data.add(item);
        upheapify(this.data.size()-1);
    }
    //lci=left child index, rci=right child index, pi=parent index,
//    ci=child index
    public void upheapify(int ci){
        int pi=(ci-1)/2;
        if(this.data.get(pi)>this.data.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }

    public void swap(int i,int j){
        int ith=this.data.get(i);
        int jth=this.data.get(j);
        this.data.set(i,jth);
        this.data.set(j,ith);
    }

    public int remove(){
        swap(0,this.data.size()-1);
        int rem=this.data.remove(this.data.size()-1);
        downheapify(0);
        return rem;
    }
//lci=left child index, rci=right child index, pi=parent index
    public void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<this.data.size() && this.data.get(lci)<this.data.get(mini)){
           mini=lci;
        }
        if(rci<this.data.size() && this.data.get(rci)<this.data.get(mini)){
            mini=rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }

    public int getmin(){
        return this.data.get(0);
    }

    public int size(){
        return this.data.size();
    }

    public void display(){
        System.out.println(this.data);
    }

    public static void main(String[] args) {
        Min_Heap mhp=new Min_Heap();
        mhp.add(10);
        mhp.add(20);
        mhp.add(30);
        mhp.add(5);
        mhp.add(7);
        mhp.add(3);
        mhp.add(2);
        mhp.add(-10);
        mhp.add(-20);
        System.out.println(mhp.getmin());
        mhp.display();
        System.out.println(mhp.remove());
        System.out.println(mhp.remove());
        mhp.display();
    }
}
