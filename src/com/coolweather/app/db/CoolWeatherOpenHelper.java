/**
 * 首先第一阶段我们要做的就是创建好数据库和表，
 * 这样从服务器获取到的数据才能够存储到本地。
 * 建立三张表， Province、 City、 County，分别
 * 用于存放省、市、县的各种数据信息
 */
package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author baixiu0813
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/*
	 * Province表建表语句
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	
	/*
	 * City表建表语句
	 */
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer)";
	
	/*
	 * Country表建表语句
	 */
	public static final String CREATE_COUNTRY = "create table Country ("
			+ "id integer primary key autoincrement, "
			+ "country_name text, "
			+ "country_code text, "
			+ "city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//创建三张表
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
