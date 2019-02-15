package com.mongo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config001.properties")
public class LibraryUtils {

	@Value("${spring.filestorage.path}")
	private String filesystemPath;
	@Value("${apiuser.name}")
	private String apiusername;
	@Value("${apiuser.password}")
	private String apiuserpassword;

	public String getApiuserpassword() {
		return apiuserpassword;
	}

	public String getFilesystemPath() {
		return filesystemPath;
	}

	public String getApiusername() {
		return apiusername;
	}
}
