package com.waqasaslam.ebookapp;

import java.io.Serializable;

public class Constant implements Serializable{
 
	private static final long serialVersionUID = 1L;

	//this is the path of json url
	public static final String SERVER_IMAGE_CATEGORY="http://ranahosting.website/ebook/upload/category/";
	public static final String SERVER_IMAGE_NEWSLIST_THUMBS="http://ranahosting.website/ebook/upload/thumbs/";
	public static final String SERVER_IMAGE_NEWSLISTDETAILS="http://ranahosting.website/ebook/upload/";
	public static final String CATEGORY_URL = "http://ranahosting.website/ebook/api.php";
	public static final String CATEGORY_ITEM_URL = "http://ranahosting.website/ebook/api.php?cat_id=";
  
	public static final String CATEGORY_ARRAY_NAME="AndroidEbookApp";
	public static final String CATEGORY_NAME="category_name";
	public static final String CATEGORY_CID="cid";
	public static final String CATEGORY_IMAGE="category_image";
	public static final String CATEGORY_AUTHOR="author";

	public static final String CATEGORY_ITEM_CID="cid";
	public static final String CATEGORY_ITEM_NAME="category_name";
	public static final String CATEGORY_ITEM_IMAGE="category_image";
	public static final String CATEGORY_ITEM_STATUS="status";
 	public static final String CATEGORY_ITEM_CAT_ID="nid";
	public static final String CATEGORY_ITEM_NEWSHEADING="news_heading";
	public static final String CATEGORY_ITEM_NEWSDESCRI="news_description";
	public static final String CATEGORY_ITEM_NEWSIMAGE="news_image";
	public static final String CATEGORY_ITEM_NEWSDATE="news_date";
	public static final String CATEGORY_ITEM_NEWSSTATUS="news_status";

	public static String CATEGORY_TITLE;
	public static int CATEGORY_IDD;

 
}
