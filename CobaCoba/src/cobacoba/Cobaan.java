///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package cobaan;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.Date;
//import com.google.gson.Gson;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
///**
// *
// * @author User
// */
//class Akun<U, P>
//{
//    U obj1;  // An object of type T
//    P obj2;  // An object of type U
//    private ArrayList<Akun> akun;
//  
//    public ArrayList<Akun> getAkun(){
//        return this.akun;
//    }
//    public void setBuku(ArrayList<Akun> akun){
//        this.akun = akun;
//    }
//    // constructor
//    Akun(U obj1, P obj2)
//    {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//  
//    // To print objects of T and U
//    public void print()
//    {
//        System.out.println(obj1);
//        System.out.println(obj2);
//    }
//}
//class akunClass {
//  private ArrayList<Akun> akun;
//  
//    public ArrayList<Akun> getAkun(){
//        return this.akun;
//    }
//    public void setBuku(ArrayList<Akun> akun){
//        this.akun = akun;
//    }
//  }  
//// Driver class to test above
//class Cobaan
//{
//    public static void main (String[] args)
//    {
//        ArrayList<Akun> akun;
//        Gson gson = new Gson();
//        Reader reader = Files.newBufferedReader(Paths.get("C:/Users/User/source/repos/Modul7_1302204008/Modul7_1302204008/bank_transfer_config.json"));
//        akunClass akun = gson.fromJson(reader,akunClass.class);
//        Akun <String, Integer> obj;
//        int cobaan = 28;
//        String coba = "Cobaan";
//        obj = new Akun<String,Integer>(coba,cobaan);
//        obj.print();
//    }
//}

