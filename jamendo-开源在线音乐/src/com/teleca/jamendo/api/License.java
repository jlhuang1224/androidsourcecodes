/*
 * Copyright (C) 2009 Teleca Poland Sp. z o.o. <android@teleca.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.teleca.jamendo.api;

/**
 * license unit
 * 
 * @author Lukasz Wisniewski
 */
public class License {
	
	private int id;
	
	private String url;
	
	private String image;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}
}
