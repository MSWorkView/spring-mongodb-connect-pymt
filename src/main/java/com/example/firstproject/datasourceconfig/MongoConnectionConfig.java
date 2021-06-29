package com.example.firstproject.datasourceconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.example.firstproject.utils.Utils;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConnectionConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		return "myFirstDatabase";
	}

	@Override
	public MongoClient mongoClient() {
		StringBuilder connectionStringSb = new StringBuilder("mongodb+srv://");
		connectionStringSb.append(Utils.getEnvironmentConfig("username"));
		connectionStringSb.append(":");
		connectionStringSb.append(Utils.getEnvironmentConfig("password"));
		connectionStringSb.append("@");
		connectionStringSb.append(Utils.getEnvironmentConfig("clustername"));
		connectionStringSb.append("/");
		connectionStringSb.append(Utils.getEnvironmentConfig("dbname"));
		connectionStringSb.append("?");
		connectionStringSb.append(Utils.getEnvironmentConfig("otheroption"));
		ConnectionString connectionString = new ConnectionString(connectionStringSb.toString());
		MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString)
				.build();

		return MongoClients.create(mongoClientSettings);
	}

}
