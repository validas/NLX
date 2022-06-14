/**
 * Link Processor Class. Queries Database for Link rules or creates new rules
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix schaller
 */

package de.validas.nlx.ai.neo4j;

import static de.validas.nlx.constants.Neo4jConstants.DB_PASS;
import static de.validas.nlx.constants.Neo4jConstants.DB_URI;
import static de.validas.nlx.constants.Neo4jConstants.DB_USER;

import java.util.List;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;
import org.neo4j.driver.v1.TransactionWork;
import org.neo4j.driver.v1.exceptions.ServiceUnavailableException;

import de.validas.nlx.ai.IDbAccess;


public class Neo4jAccess implements IDbAccess {
	
	// default credentials
	
	protected String uri;
	protected String user;
	protected String pass;
	
	
	protected Driver driver;
	
	protected boolean dbConnected = false;
	protected boolean dbInit = false;
	
	public enum Action {
		WRITE,
		READ;
	}
	
//	public enum Direction {
//		LEFT,
//		RIGHT;
//	}
	

	public Neo4jAccess() {
		this (DB_URI, DB_USER, DB_PASS);
	}

	public Neo4jAccess(String uri, String user, String pass) {
		driver = connectToDatabase(uri, user, pass);
		this.uri = uri;
		this.user = user;
		this.pass = pass;
		if (driver != null)
			dbConnected = driver.session().isOpen();
	}
	
	public Driver connectToDatabase(String uri, String user, String pass) {
		Driver driver;  
		try {
			driver = GraphDatabase.driver(uri, AuthTokens.basic(user, pass) );
			if (driver != null)
				dbInit  = true;
			return driver;	
		} catch (ServiceUnavailableException e) {
			return null;
		}
	}
	/**
	 * returns a String as querey result
	 * @param input
	 * @param action
	 * @return
	 */
	public String runCodeString(String input, Action action)
    {
    	try ( Session session = driver.session() )
    	{
    		TransactionWork<String> txWork = new TransactionWork<String>()
            {
                @Override
                public String execute( Transaction tx )
                {
                    StatementResult result = tx.run( input );
                    return result.list().toString();
                }
            }; 
    		
    		if (action == Action.WRITE)
    			return session.writeTransaction(txWork);
    		else
    			return session.readTransaction(txWork);
    	}
    }
	/**
	 * returns a Record list as querey result
	 * @param input
	 * @param action
	 * @return
	 */
	public List<Record> runCodeRecords(String input, Action action)
    {
    	try ( Session session = driver.session() )
    	{
    		List<Record> queryResult = null;
    		TransactionWork<List<Record>> txWork = new TransactionWork<List<Record>>()
            {
                @Override
                public List<Record> execute( Transaction tx )
                {
                    StatementResult result = tx.run( input );
                    return result.list();
                }
            }; 

    		if (action == Action.WRITE)
    			queryResult = session.writeTransaction(txWork);
    		else
    			queryResult = session.readTransaction(txWork);
    		return queryResult;
    	}
    }

	
	public boolean ensureDbConnect() {
		if (!dbConnected ) {
			driver = connectToDatabase(uri, user, pass);
			if (driver != null)
				dbConnected = driver.session().isOpen();
			else 
				return false;
		}
		
		return dbConnected;
	}

	@Override
	public boolean isConnected() {
		return dbInit;
	}

}
