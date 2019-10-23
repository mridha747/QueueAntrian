/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Lenovo
 */
public class Antrian {

  String data[];
    int tail;
    int noAntrian;

    public Antrian(int x){
        data = new String[x];
        tail = -1;
        noAntrian = 0;
    }

    public void enqueue(String nama) {
        if (tail < data.length) {
            noAntrian++;

            data[++tail] = nama;
            System.out.println("Antrian  " + noAntrian );
            System.out.println("Nama Pengantri " + nama);

        } else {
            System.out.println("Antrian Penuh");
        }
    }

    public String dequeue(){
        if(tail >= 0){
            String temp = data[0];
            noAntrian--;
            

            for (int i = 0; i < data.length-1 ; i++) {
                data[i] = data[i+1];
                
            }
            --tail;
            return temp;
        }
        else{
            System.out.println("Antrian Kosong");
        }

        return "";
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.println("Antrian " + (i+1) );
            System.out.println("Nama Pengantri :" + data[i]);
        }
    }
    
}
