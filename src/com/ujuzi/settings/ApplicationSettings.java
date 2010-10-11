/**
 * Copyright 2010 Ahmed Mohammed Maaway
 *
 * This file is part of Ujuzi.
 *
 * Ujuzi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ujuzi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ujuzi.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Additional information can be found in README.txt or at
 * <http://www.ujuziapp.com/>.
 *
 */

package com.ujuzi.settings;

/**
 *
 * @author Ahmed Maawy
 */
public class ApplicationSettings {
    public static String BASE_URL = "http://api.one-economy.com";
    public static String BASE_POSTAL = "00100";
    public static String BASE_OEID = "2931477";
    public static String BASE_LAT = "%20-1.2833";
    public static String BASE_LON = "36.81";
    public static String BASE_RADIUS = "20";

    public static String getApiAllCategories(String language) {
        return "GetAllCategories?language=" + language;
    }

    public static String getApiCategoryByID(String language, String categoryID) {
        return "GetCategoryNameById?language=" + language + "&categoryId=" + categoryID;
    }

    public static String getApiResourceCountByCategoryZip(String language, String catID, String region, String zipCode) {
        return "GetResourceCountByCategoryZip?language=" + language + "&CategoryItemId=" + catID + "&Region=" + region + "&zipcode=" + zipCode;
    }

    public static String getApiResourceCanvasLocations() {
        return "GetAllResourceCanvasLocations";
    }

    public static String getApiResourceCanvasLocation(String resID) {
        return "GetResourceCanvasLocation?rlcId=" + resID;
    }

    public static String getApiContentByLocationZip(String language, String catID, String zipCode) {
        return "GetContentByCategory?language=" + language + "&categoryId=" + catID + "&zipcode=" + zipCode;
    }

    public static String getApiContentByLocationOEID(String language, String catID, String oeID, String searchText) {
        return "v3/GetContentByCategory?language=" + language + "&categoryId=" + catID + "&oeid=" + oeID + "&searchText=" + searchText;
    }

    public static String getApiContentByCateoryLatLon(String language, String catID, String searchText, String lon, String lat, String radius) {
        return "v3/SearchContentByCategoryLatLon?language=" + language + "&categoryIdList=" + catID + "&searchText=" + searchText + "&lon=" + lon + "&lat=" + lat + "&radius=" + radius;
    }

    public static String getApiResourceByCategoryZip(String language, String zipCode, String catIDList, String searchText) {
        return "SearchContentByCategoryZip?language=" + language + "&zipcode=" + zipCode + "&categoryIdList=" + catIDList + "&searchText=" + searchText;
    }

    public static String getApiResourceByCategoryZip(String language, String zipCode, String catIDList, String searchText, String demographics) {
        return "SearchContentByCategoryZip?language=" + language + "&zipcode=" + zipCode + "&categoryIdList=" + catIDList + "&searchText=" + searchText + "demographics=" + demographics;
    }

    public static String getApiResourceByCategoryLatLon(String language, String catID, String lat, String lon, String radius) {
        return "SearchContentByCategoryLatLon?language=" + language + "&categoryIdList=" + catID + "&lon=" + lon + "&lat=" + lat + "&radius=" + radius;
    }

    public static String getApiCategoryInfoByID(String lanugage, String catID) {
        return "GetCategoryInfoById?categoryid=" + catID + "&language=" + lanugage;
    }

    public static String getApiResourceByID(String language, String resID) {
        return "GetContentById?language=" + language + "&contentId=" + resID;
    }

    public static String getApiResourceByLayar(String language, String lat, String lon, String radius, String catID) {
        return "GetContentForLayar?lon=" + lon + "&RADIOLIST=" + catID + "&radius=" + radius + "&lat=" + lat;
    }
}
