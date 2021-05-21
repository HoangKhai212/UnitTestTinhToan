/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Admin
 */
public class UnitTestTinhPhi {
    
    public UnitTestTinhPhi() {
       
    }

    @Test
    public void LuongCaNhanNhoHonKhong(){
        long i = -10000;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemCaNhan(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongCaNhanBangKhong(){
        long i = 0;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemCaNhan(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongCaNhanLonHonKhong_NhoHonBonTrieu(){
        long i = 1000000;
        final double expected = 1;
        final double actual = TinhPhi.tinhPhiBaoHiemCaNhan(i);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void LuongCaNhanBangBonTrieu(){
        long i = 4000000;
        final double expected = 1;
        final double actual = TinhPhi.tinhPhiBaoHiemCaNhan(i);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void LuongCaNhanLonHonBonTrieu(){
        long i = 5000000;
        final double expected = 400000;
        final double actual = TinhPhi.tinhPhiBaoHiemCaNhan(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongDoanhNghiepNhoHonKhong(){
        long i = -10000;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemDN(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongDoanhNghiepBangKhong(){
        long i = 0;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemDN(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongDoanhNghiepLonHonKhong(){
        long i = 1000000;
        final double expected = 175000;
        final double actual = TinhPhi.tinhPhiBaoHiemDN(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void LuongTuDoNhoHonKhong(){
        long i = -10000;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemTudo(i);
        Assert.assertEquals(expected, actual);
    }
    
     @Test
    public void LuongTuDoBangKhong(){
        long i = 0;
        final double expected = 0;
        final double actual = TinhPhi.tinhPhiBaoHiemTudo(i);
        Assert.assertEquals(expected, actual);
    }
    
     @Test
    public void LuongTuDoLonHonKhong(){
        long i = 4000000;
        final double expected = 880000;
        final double actual = TinhPhi.tinhPhiBaoHiemTudo(i);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void ListTongLuongRong(){
        List<Long> list = new ArrayList<>();
        final double expected = 0;
        final double actual = TinhPhi.tongLuong(list);
        Assert.assertEquals(expected, actual);
    }
    
    @Test 
    public void TinhTongLuong(){
        List<Long> list = new ArrayList<>();
        list.add(100000L);
        list.add(200000L);
        final double expected = 300000;
        final double actual = TinhPhi.tongLuong(list);
        Assert.assertEquals(expected, actual);
    }
    
}
